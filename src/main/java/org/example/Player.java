package org.example;

import de.gurkenlabs.litiengine.IUpdateable;
import de.gurkenlabs.litiengine.entities.Creature;
import de.gurkenlabs.litiengine.input.PlatformingMovementController;
import de.gurkenlabs.litiengine.physics.IMovementController;

public class Player extends Creature implements IUpdateable {
    private static Player instance;

    private Player() {
        super("player");
    }

    public static Player instance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
    }

    @Override
    protected IMovementController createMovementController() {
        return new PlatformingMovementController(this);
    }
}
