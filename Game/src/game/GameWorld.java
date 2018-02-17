package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

/**
 *
 * @author greg
 */

/**
 * A world with some bodies.
 */
public class GameWorld extends World {
    private Bird bird;
    private Squirrel squirrel;
    
    public GameWorld() {
        super();
        
        // make the ground
        Shape groundShape = new BoxShape(11, 0.5f);
        Body ground = new StaticBody(this, groundShape);
        ground.setPosition(new Vec2(0, -11.5f));
        // walls
        Shape leftWallShape = new BoxShape(0.5f, 6, new Vec2(-11.5f, 5.5f));
        Fixture leftWall = new SolidFixture(ground, leftWallShape);
        Shape rightWallShape = new BoxShape(0.5f, 6, new Vec2(11.5f, 5.5f));
        Fixture rightWall = new SolidFixture(ground, rightWallShape);
        

        // make platforms
        Shape boxShape = new BoxShape(4, 0.5f);
        Body platform1 = new StaticBody(this, boxShape);
        platform1.setPosition(new Vec2(-7, 5.5f));
        Body platform2 = new StaticBody(this, boxShape);
        platform2.setPosition(new Vec2(5, -2.5f));
        

        // make a new bird character
        bird = new Bird(this);
        bird.setPosition(new Vec2(8, -10));
        
        // creates a new squirrel character
        squirrel = new Squirrel(this);
        squirrel.setPosition(new Vec2(6, -10));
        
        
        // code to spawn oranges & acorns in the game world
        for (int i = 0; i < 11; i++) {
            Body orange = new Orange(this);
            orange.setPosition(new Vec2(i*2-10, 10));
            orange.addCollisionListener(new BirdPickup(bird));
            
            Body acorn = new Acorn(this);
            acorn.setPosition(new Vec2(i*2-8, 8));
            acorn.addCollisionListener(new SquirrelPickup(squirrel));
            
        }
    }
    
    // returns the squirrel for use in it's controller
    public Squirrel getSquirrel() {
        return squirrel;
    }
    
    // returns the bird for use in it's controller
    public Bird getBird() {
        return bird;
    }
}
