import greenfoot.*;
import java.awt.Color;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author Will McCarty
 * @version 4/10/2015 Version 1
 */
public class Button extends Actor
{
    private boolean wasClicked = false;
    
    public Button(int width, int height) {
        GreenfootImage emptyRect = new GreenfootImage(width, height);
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {}
  
    /** getter to see if button clicked. 
    * @return wasClicked bool saying if button clicked.
    */
    public boolean getClicked() {
        return wasClicked;
    }
}
