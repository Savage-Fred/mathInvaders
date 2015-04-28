import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Exit button for instructions menu.
 * 
 * @author Will McCarty
 * @version 4/10/2015 versio 1
 */
public class ExitButton extends Button
{
    private boolean wasClicked;
    
    /**
     * @param w for width of box.
     * @param h for height of box.
     */
    public ExitButton(int w, int h) {
        super(w,h);
    }
    
    public void act() 
    {
        wasClicked = Greenfoot.mouseClicked(this);
        if (wasClicked) {
            Greenfoot.setWorld(new OpenMenu());
        }
    }    
}
