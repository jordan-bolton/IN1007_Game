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
 * 
 */
public class Acorn extends DynamicBody {
    private static final Shape shape = new PolygonShape
        (0.292f,-0.044f, -0.067f,-0.374f, -0.316f,0.158f, 0.06f,0.493f);
    
    private static final BodyImage acornImage = new BodyImage("data/acorn.png", 1.25f);
    
    public Acorn(World world) {
        super(world, shape);
        addImage(acornImage);
        
    }
}
