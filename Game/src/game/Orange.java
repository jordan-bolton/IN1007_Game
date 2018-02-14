package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import java.awt.Color;

/**
 *
 * @author greg
 */


/**
 * An orange.
 */
public class Orange extends DynamicBody {
    private static final Shape shape = new CircleShape(0.2f);
    
    public Orange(World world) {
        super(world, shape);
        setFillColor(Color.orange);
    }
}
