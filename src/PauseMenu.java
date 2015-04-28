import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseMenu here.
 * 
 * @author Will McCarty
 * @version Version 2
 */
public class PauseMenu extends Actor
{
    Button testButton = new ExitButton(100,00);
    World myWorld = this.getWorld();
    /**
     * Constructor 
     */
    public PauseMenu() {
        myWorld.addObject(testButton, 800,600);
    }
    /**
     * Act - do whatever the PauseMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
}
