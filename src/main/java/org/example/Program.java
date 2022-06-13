package org.example;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.GameListener;
import de.gurkenlabs.litiengine.resources.Resources;
import org.example.screens.IngameScreen;

public class Program {
    public static void main(String[] args) {

        // configure the game
        //https://litiengine.com/docs/game-api/

        Game.init(args);


        Game.addGameListener(new GameListener() {
            @Override
            public void started() {
                System.out.println("-- Game started");
            }


            @Override
            public void terminated() {
                System.out.println("-- Game stopped");
            }

        });

        // load resources
        Resources.load("game.litidata");
        Game.world().loadEnvironment("level1");

        Game.graphics().setBaseRenderScale(4f);

        Game.screens().add(new IngameScreen());

        Game.start();
    }
}
