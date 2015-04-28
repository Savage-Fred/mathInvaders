import greenfoot.*;
import javax.swing.JOptionPane;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * NewGameButton brings up box for user to enter a new name and starts a new game. 
 * 
 * @author Will McCarty
 * @version 4/10/2015
 */
public class NewGameButton extends Button
{
    //----- FIELDS
    boolean wasClicked = false;
    private String newName;
    //----- END FIELDS
    
    //----- CONSTRUCTORS
    public NewGameButton(int width, int height) {
        super(width, height);
    }
    
    //----- END CONSTRUCTORS
    
    //----- METHODS
    /**
     * Act method invoked by Greenfoot framework.
     */
    public void act() 
    {
        wasClicked = Greenfoot.mouseClicked(this);
        if (wasClicked == true) { 
            String inputValue = JOptionPane.showInputDialog("Please Enter Your Name");
            this.setName(inputValue);
            Greenfoot.setWorld(new GameTypeMenu());
        }
            
    }
    
    public String getName() {
        return newName;
    }
    
    public void setName(String nm) {
        newName = nm;
    }
    
    public boolean wasClicked(){return wasClicked;}
    public void setClicked(boolean s){wasClicked = s;}
}
