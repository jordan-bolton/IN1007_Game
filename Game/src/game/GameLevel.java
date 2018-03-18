package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

/**
 * A level of the game.
 */
public abstract class GameLevel extends World {
    private Bird player;
    private Squirrel player2;
    
    public Bird getPlayer() {
        return player;
    }
    
    public Squirrel getPlayer2() {
        return player2;
    }
    
    /**
     * Populate the world of this level.
     * Child classes should this method with additional bodies.
     */
    public void populate(Game game) {
        
        // make a new bird character
        player = new Bird(this);
        player.setPosition(startPosition());
        
        player2 = new Squirrel(this);
        player2.setPosition(startPosition());
        
        
        
        
        Door door = new Door(this);
        door.setPosition(doorPosition());
        door.addCollisionListener(new DoorListener(game));
            
    }
    
    /** The initial position of the player. */
    public abstract Vec2 startPosition();
    
    /** The position of the exit door. */
    public abstract Vec2 doorPosition();
    
    /** Is this level complete? */
    public abstract boolean isCompleted();
}
