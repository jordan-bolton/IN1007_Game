package game;

import city.cs.engine.*;

/**
 * Collision listener that allows the bird to collect things.
 */
public class BirdPickup implements CollisionListener {
    private Bird bird;
    
    public BirdPickup(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void collide(CollisionEvent e) {
       if (e.getReportingBody() instanceof Orange && e.getOtherBody() == bird) {
           bird.incrementOrangeCount();
           e.getReportingBody().destroy();
       }


    }
    
}
