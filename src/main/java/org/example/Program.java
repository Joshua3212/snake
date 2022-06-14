package org.example;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.resources.Resources;
import org.example.screens.IngameScreen;

public class Program {
    public static void main(String[] args) {

        // configure the game
        //https://litiengine.com/docs/game-api/

        Game.init(args);


        //
        // Game.addGameListener(new GameListener() {
        //    @Override
        //    public void started() {
        //        System.out.println("-- Game started");
        //    }
//
//
        //    @Override
        //    public void terminated() {
        //        System.out.println("-- Game stopped");
        //    }
//
        //});


        Game.graphics().setBaseRenderScale(4f);
        // load resources
        Resources.load("game.litidata");


        PlayerInput.init();
        SnakeLogic.init();

        Game.screens().add(new IngameScreen());

        // load environment
        Game.world().loadEnvironment("level1");

        Game.start();
    }
}
