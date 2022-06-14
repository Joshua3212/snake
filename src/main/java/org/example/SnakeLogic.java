package org.example;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.entities.Spawnpoint;
import de.gurkenlabs.litiengine.graphics.Camera;
import de.gurkenlabs.litiengine.graphics.PositionLockCamera;

public class SnakeLogic {
    public SnakeLogic() {
    }


    // initialize the game
    public static void init() {
        //set a camera
        Camera camera = new PositionLockCamera(Player.instance()); // locked to the player -> moves with the player
        camera.setClampToMap(true);

        Game.world().setCamera(camera);


        Game.world().setGravity(120);

        Game.world().onLoaded(e -> {
            Spawnpoint enter = e.getSpawnpoint("enter");

            //spawn a player if it doesn't exist yet
            if (enter != null) {
                enter.spawn(Player.instance());
            }
        });
    }
}
