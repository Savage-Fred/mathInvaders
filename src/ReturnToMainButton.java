import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button class to bring user back to Main Menu.
 * Used in in-game pause menu and in end of game scenario.
 * 
 * @author Will McCarty
 * @version Version 1
 */
public class ReturnToMainButton extends Button
{
    private boolean wasClicked = false;
    /**
     * Act - do whatever the ReturnToMainButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       // check if button was clicked
       wasClicked = Greenfoot.mouseClicked(this);
       // if clicked, change to difficulty menu. 
       if (wasClicked) {Greenfoot.setWorld(new GameTypeMenu());}
    }    
}
