/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.BodyImage;
import city.cs.engine.PolygonShape;
import city.cs.engine.Shape;
import city.cs.engine.Walker;
import city.cs.engine.World;

/**
 *
 * @author Jordan Bolton
 */
public class Squirrel extends Walker {
    
    private static final Shape shape = new PolygonShape(
            0.475f,0.174f, -0.191f,0.434f, -0.447f,0.224f, -0.365f,-0.434f, 0.401f,-0.474f);

    // scale changed to make squirrel slighly smaller than the bird
    private static final BodyImage image =
        new BodyImage("data/squirrel.png", 1.7f);

    private int acornCount;
    // life count is incremented by collecting acorns
    // 2 acorns = 1 additional life
    private int lifeCount;

    public Squirrel(World world) {
        super(world, shape);
        addImage(image);
        acornCount = 0;
        lifeCount = 5;
    }

    public int getAcornCount() {
        return acornCount;
    }

    public void incrementAcornCount() {
        acornCount++;
        System.out.println("Acorn collected.  Acorn count = " + acornCount);
    }    
    
    public int getLifeCount() {
        return lifeCount;
    }

    // logic to be added to add lives depending on the number of acorns later
    public void incrementLifeCount() {
        lifeCount++;
        System.out.println("One life added.  Total = " + lifeCount);
    }  
    // logic to be added later
    public void decrementLifeCount() {
        lifeCount--;
        System.out.println("One life lost.  Total = " + lifeCount);
    }
    
}
