import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @Claire
 * @11 October 2015
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    
    
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    private int x;
    private int y;
    private Moon moon;
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        // ...
        
        moon.draw(g2);
        
        Building building1 = new Building(0,200);
        Building building2 = new Building(100,150);
        Building building3 = new Building(200,250);
        Building building4 = new Building(300,175);
        Building building5 = new Building(400,230);
        
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        Random generator = new Random();
        int parameter = generator.nextInt(600)+1;
        
        moon = new Moon(parameter,10);
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }
}