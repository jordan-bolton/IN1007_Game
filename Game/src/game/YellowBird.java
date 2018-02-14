package game;

import city.cs.engine.*;

/**
 * Simple character
 */
public class YellowBird extends Walker {

    // Remember:  using the keyword static below means the fields shape and image belong to the class, rather than any instance. 
    // That means there is a single shape and image for all instances of the class.
    private static final Shape shape = new PolygonShape(
            0.149f, 0.975f, 0.775f, 0.193f, 0.772f, -0.099f, 0.401f, -0.928f, -0.36f, -0.922f, -0.719f, -0.025f, -0.725f, 0.163f, -0.14f, 0.972f);

    private static final BodyImage image =
        new BodyImage("data/yellow-bird.gif", 2.25f);

    private int orangeCount;

    public YellowBird(World world) {
        super(world, shape);
        addImage(image);
        orangeCount = 0;
    }

    public int getOrangeCount() {
        return orangeCount;
    }

    public void incrementOrangeCount() {
        orangeCount++;
        System.out.println("Tasty!  Orange count = " + orangeCount);
    }
}
