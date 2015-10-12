import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Write a description of class Moon here.
 * 
 * @Claire
 * @1 October 2015
 */
public class Moon
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    /**
     * Default constructor for objects of class Moon
     */
    public Moon(int x, int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
        
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon = new Ellipse2D.Double(xLeft+10,yTop+10,60,60);//,w,h);
        g2.setColor(Color.BLUE);
        g2.fill(moon);
        g2.draw(moon);
    }
    
}