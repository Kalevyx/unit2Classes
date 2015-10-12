import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Building
{
    private int xLeft;
    private int yTop;
    
    public Building(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    public void draw(Graphics2D g2)
    {
        Rectangle building = new Rectangle(xLeft, yTop, 90, 400-yTop);
        Rectangle window1 = new Rectangle(xLeft+10, yTop+10, 15, 15);
        Rectangle window2 = new Rectangle(xLeft+35, yTop+10, 15, 15);
        Rectangle window3 = new Rectangle(xLeft+60, yTop+10, 15, 15);
        Rectangle window4 = new Rectangle(xLeft+10, yTop+35, 15, 15);
        Rectangle window5 = new Rectangle(xLeft+35, yTop+35, 15, 15);
        Rectangle window6 = new Rectangle(xLeft+60, yTop+35, 15, 15);
        Rectangle window7 = new Rectangle(xLeft+10, yTop+60, 15, 15);
        Rectangle window8 = new Rectangle(xLeft+35, yTop+60, 15, 15);
        Rectangle window9 = new Rectangle(xLeft+60, yTop+60, 15, 15);
        Rectangle window10 = new Rectangle(xLeft+10, yTop+85, 15, 15);
        Rectangle window11 = new Rectangle(xLeft+35, yTop+85, 15, 15);
        Rectangle window12 = new Rectangle(xLeft+60, yTop+85, 15, 15);
        Rectangle window13 = new Rectangle(xLeft+10, yTop+110, 15, 15);
        Rectangle window14 = new Rectangle(xLeft+35, yTop+110, 15, 15);
        Rectangle window15 = new Rectangle(xLeft+60, yTop+110, 15, 15);
        
        g2.setColor(Color.DARK_GRAY);
        g2.fill(building);
        g2.draw(building);
        
        g2.setColor(Color.YELLOW);
        
        g2.fill(window1);
        g2.fill(window2);
        g2.fill(window3);
        g2.fill(window4);
        g2.fill(window5);
        g2.fill(window6);
        g2.fill(window7);
        g2.fill(window8);
        g2.fill(window9);
        g2.fill(window10);
        g2.fill(window11);
        g2.fill(window12);
        g2.fill(window13);
        g2.fill(window14);
        g2.fill(window15);
        g2.draw(window1);
        g2.draw(window2);
        g2.draw(window3);
        g2.draw(window4);
        g2.draw(window5);
        g2.draw(window6);
        g2.draw(window7);
        g2.draw(window8);
        g2.draw(window9);
        g2.draw(window10);
        g2.draw(window11);
        g2.draw(window12);
        g2.draw(window13);
        g2.draw(window14);
        g2.draw(window15);
    }
}