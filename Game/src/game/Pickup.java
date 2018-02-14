package game;

import city.cs.engine.*;

/**
 * Collision listener that allows the bird to collect things.
 */
public class Pickup implements CollisionListener {
    private YellowBird bird;
    
    public Pickup(YellowBird bird) {
        this.bird = bird;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == bird) {
            bird.incrementOrangeCount();
            e.getReportingBody().destroy();
        }
    }
    
}
