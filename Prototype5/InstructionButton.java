import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to open Intructions page.
 * 
 * @author Will McCarty
 * @version 4/10/2015
 */
public class InstructionButton extends Button
{
    /**
     * Act - do whatever the InstructionButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public InstructionButton(int width, int height) {
        super(width, height);
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new InstructionsMenu());
        } 
    }    
}
