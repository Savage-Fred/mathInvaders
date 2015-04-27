import greenfoot.*; 
import java.awt.Color; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class to print basic text to screen.
 * 
 * @author Will McCarty
 * @version 4/10/2015
 */
public class BasicText extends Actor
{
    //---- Constructor
    /**
     * @param outputString String of text to be displayed. 
     */
    public BasicText(String outputString) {
        setImage(new GreenfootImage(outputString, 50, Color.WHITE, null));
    }
    /**
     * Act - do whatever the BasicText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
