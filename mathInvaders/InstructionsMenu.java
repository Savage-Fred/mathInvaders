import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Brings up game information including how to play and what the game is.
 * 
 * @author Will McCarty
 * @version 4/10/2015 Version 1.
 */
public class InstructionsMenu extends Menu
{
    ExitButton exit = new ExitButton(195,60);

    /**
     * Constructor for objects of class InstructionsMenu.
     */
    public InstructionsMenu()
    {
        addObject(exit, 90, 45);
    }
}
