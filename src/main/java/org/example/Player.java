package org.example;

import de.gurkenlabs.litiengine.IUpdateable;
import de.gurkenlabs.litiengine.entities.CollisionInfo;
import de.gurkenlabs.litiengine.entities.Creature;
import de.gurkenlabs.litiengine.entities.EntityInfo;
import de.gurkenlabs.litiengine.entities.MovementInfo;
import de.gurkenlabs.litiengine.input.PlatformingMovementController;
import de.gurkenlabs.litiengine.physics.IMovementController;

@EntityInfo(width = 20, height = 20)
@MovementInfo(velocity = 70)
@CollisionInfo(collisionBoxWidth = 20, collisionBoxHeight = 20, collision = true)
public class Player extends Creature implements IUpdateable {
    private static Player instance;

    private Player() {
        super("gurknukem");
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
        return new PlatformingMovementController<>(this);
    }
}
