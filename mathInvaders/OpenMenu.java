import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * OpenMenu is the first class to run when the game starts. It has options for new users, existing users
 * and for instructions on how to play. 
 * 
 * @author Will McCarty
 * @version 4/10/2015 version 1
 */
public class OpenMenu extends Menu
{
    /** 
     * Fields for buttons
     */
    NewGameButton newGame = new NewGameButton(195, 60);
    Button loadGame = new Button(195, 60);
    InstructionButton i = new InstructionButton(195, 60);
    
    

    /**
     * Constructor for objects of class OpenMenu.
     * 
     */
    public OpenMenu()
    {  
        
        addObject(newGame, 400, 280);
        addObject(loadGame, 400, 370);
        addObject(i, 400, 540);
    }
    
    
    public void act() {
    }
}
