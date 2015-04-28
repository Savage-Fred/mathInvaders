import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * OpenMenu is the first class to run when the game starts. It has options for new users, existing users
 * and for instructions on how to play. 
 * 
 * Changes from v1: fixed buttons to be full images instead of greenfoot image. 
 * 
 * To Fix: Load Game still does not work. Leaving it out for Beta. Will update for final release once it works.
 * 
 * 
 * @author Will McCarty
 * @version 4/10/2015 version 2.0
 */
public class OpenMenu extends Menu
{
    /** 
     * Fields for buttons
     */
    NewGameButton newGame = new NewGameButton(195, 60);
    LoadGameButton loadGame = new LoadGameButton(195, 60);
    InstructionButton i = new InstructionButton(195, 60);
    
    /** Field for userInfo */
    private UserInfo u = new UserInfo();

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
        if (loadGame.wasClicked()) {
             BasicText t = new BasicText("Nothing to see here for now.");
             addObject(t, 400, 400);
             loadGame.setClicked(false);
             if(newGame.wasClicked()) {removeObject(t); }
        }
    }
    
    public UserInfo getUserInfo(){return u;}
    public void setUserInfo(UserInfo uI) {u = uI;}
}
