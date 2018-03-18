package game;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import city.cs.engine.*;

/**
 * extended view
 */
public class MyView extends UserView {
    Bird bird;
    
    private Image background;
    
    public MyView(World world, Bird bird, int width, int height) {
        super(world, width, height);
        this.bird = bird;
        this.background = new ImageIcon("data/game-background.jpg").getImage();
    }
    
    public void setBird(Bird bird) {
        this.bird = bird;
    }
    
    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background, 0, 0, this);
    }

    @Override
    protected void paintForeground(Graphics2D g) {
        // code to display the total number of oranges eollected by the bird
        g.drawString("Score= " + bird.getOrangeCount(), 75, 105);
    }


}
