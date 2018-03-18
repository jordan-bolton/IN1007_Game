package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

/**
 * Level 2 of the game
 */
public class Level2 extends GameLevel {

    private static final int NUM_ORANGES = 7;
    private static final int NUM_ACORNS = 3;
    private Squirrel player2;
    private SquirrelController controller;
    
    /**
     * Populate the world.
     */
    @Override
    public void populate(Game game) {
        super.populate(game);

        // make the ground
        Shape groundShape = new BoxShape(11, 0.5f);
        Body ground = new StaticBody(this, groundShape);
        ground.setPosition(new Vec2(0, -11.5f));
        
        // walls
        Shape leftWallShape = new BoxShape(0.5f, 6, new Vec2(-11.5f, 5.5f));
        Fixture leftWall = new SolidFixture(ground, leftWallShape);
        Shape rightWallShape = new BoxShape(0.5f, 6, new Vec2(11.5f, 5.5f));
        Fixture rightWall = new SolidFixture(ground, rightWallShape);
        

        // make some platforms
        Shape platformShape = new BoxShape(4, 0.5f);
        Body platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(-7, 5.5f));
        Body platform2 = new StaticBody(this, platformShape);
        platform2.setPosition(new Vec2(7, 7.5f));
        Body platform3 = new StaticBody(this, platformShape);
        platform3.setPosition(new Vec2(6, -3.5f));
        
        
        for (int i = 0; i < NUM_ORANGES; i++) {
            Body orange = new Orange(this);
            orange.setPosition(new Vec2(i * 2 - 6, 10));
            orange.addCollisionListener(new BirdPickup(getPlayer()));
              

        }
        
        for (int i = 0; i < NUM_ACORNS; i++) {
            Body acorn = new Acorn(this);
            acorn.setPosition(new Vec2(i*2-8, 8));
            acorn.addCollisionListener(new SquirrelPickup(getPlayer2()));
        }
    }

    @Override
    public Vec2 startPosition() {
        return new Vec2(8, -10);
    }

    @Override
    public Vec2 doorPosition() {
        return new Vec2(9.5f, 9.5f);
    }

    @Override
    public boolean isCompleted() {
        return getPlayer().getOrangeCount() >= NUM_ORANGES;
    }
    
    
}
