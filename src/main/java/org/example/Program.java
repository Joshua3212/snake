package org.example;

import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.GameListener;
import org.example.screens.gameScreen;

public class Program {
    public static void main(String[] args) {
        Game.init(args);
        Game.start();


        //https://litiengine.com/docs/game-api/

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

        Game.screens().add(new gameScreen());
    }
}