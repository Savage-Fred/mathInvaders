import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * LoadGameButton brings up a list of previous players for the user to choose from. 
 * It is not done. There is a placeholder message for now. 
 * 
 * @author Will McCarty
 * @version 4/10/2015
 */
public class LoadGameButton extends Button
{
    //----- Fields
    private boolean wasClicked = false;
    //----- Constructors 
    /**
     * LoadGameButton constructor.
     * @param w for width of button.
     * @param h for height of button.
     */
    public LoadGameButton(int w, int h) {
        super(w,h);
    }
    
    /**
     * Act() method currently displays error message. 
     */
    public void act() 
    {
        wasClicked = Greenfoot.mouseClicked(this);
        if (wasClicked) {
            //do some stuff.
        }
    }
    
    public boolean wasClicked() {return wasClicked;}
    public void setClicked(boolean b) {wasClicked = b;}
}
