package game;

import city.cs.engine.*;
import java.awt.Color;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Jordan Bolton
 */


/**
 * An orange.
 */
public class Orange extends DynamicBody {
    private static final Shape shape = new CircleShape(0.2f);
    private static SoundClip pickupSound;
    
    public Orange(World world) {
        super(world, shape);
        setFillColor(Color.orange);
    }
    
    static {
        try {   
            pickupSound = new SoundClip("data/sound/pickup_sound.wav");
        }
        catch (UnsupportedAudioFileException|IOException|LineUnavailableException e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void destroy() {
        pickupSound.play();
        super.destroy();
    }
}
