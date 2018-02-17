/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.*;

/**
 *
 * @author Jordan Bolton
 */
public class Bird extends Walker {
private static final Shape shape = new PolygonShape(
            0.422f,0.29f, 0.272f,-0.48f, -0.416f,-0.47f, -0.562f,-0.114f, -0.174f,0.404f, 0.16f,0.47f);

    private static final BodyImage image =
        new BodyImage("data/bird.png", 2.5f);

    private int orangeCount;

    public Bird(World world) {
        super(world, shape);
        addImage(image);
        orangeCount = 0;
    }

    public int getOrangeCount() {
        return orangeCount;
    }

    public void incrementOrangeCount() {
        orangeCount++;
        System.out.println("Orange collected.  Orange count = " + orangeCount);
    }
}
