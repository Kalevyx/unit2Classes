import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Scanner;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @crli
 * @11 October 2015
 */
public class CityscapeViewer
{
    // the cityscape will be animated for 60 seconds
    static final int ANIMATION_TIME_IN_SECONDS = 60;
    
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[]args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        frame.setSize(600,440);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // use the Scanner class to prompt the user for some configurable aspect of the cityscape
        // ...
        Scanner s = new Scanner(System.in);
        System.out.print("What would you like the background color to be?\n(1-Red, 2-Orange, 3-Yellow, 4-Green, 5-Gray, 6-Magenta, 7-Pink) ");
        int backgroundColor = s.nextInt();
        if (backgroundColor == 1){
            frame.getContentPane().setBackground(Color.RED);
        } else if (backgroundColor == 2){
            frame.getContentPane().setBackground(Color.ORANGE);
        } else if (backgroundColor == 3){
            frame.getContentPane().setBackground(Color.YELLOW);
        } else if (backgroundColor == 4){
            frame.getContentPane().setBackground(Color.GREEN);
        } else if (backgroundColor == 5){
            frame.getContentPane().setBackground(Color.GRAY);        
        } else if (backgroundColor == 6){
            frame.getContentPane().setBackground(Color.MAGENTA);
        } else if (backgroundColor == 7){
            frame.getContentPane().setBackground(Color.PINK);
        } else {
            System.out.println("That background color does not exist");
        }
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent(/* pass the user-specified value */);
        frame.add(component);
        /*make the frame visible which will result in the paintComponent method being invoked on the
        component*/
        frame.setVisible(true);
        // animate the cityscape
        
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            component.nextFrame();
            Thread.sleep( 1000 );
        }
    }
}