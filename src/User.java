import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version 2.1
 */
public class User extends Actor
{   
    //----- Fields
    private UserInfo thisUser;
    
    /**
     * User constructor. 
     */
    public User()
    {
        GreenfootImage image = getImage();
        image.scale(70, 70);
        image.rotate(270);
    }
    
    public User(UserInfo info) {
        GreenfootImage image = getImage();
        image.scale(70, 70);
        image.rotate(270);
        
        thisUser.setUserName(info.getUserName());
        thisUser.setGameType(info.getGameType());
        thisUser.setDifficulty(info.getDifficulty());
        thisUser.setNewUser(info.getNewUser());
    }
    
    /**
     * Act - do whatever the User wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
    // ---- Getters
    public UserInfo getUserInfo() {
        return thisUser;
    }
    
    public String getThisUserName() {
        String name = thisUser.getUserName();
        return name;
    }
    
    public char getThisUserType() {
        char type = thisUser.getGameType();
        return type;
    }
    
    public char getThisUserDifficulty() {
        char diff = thisUser.getDifficulty();
        return diff;
    }
    
    public boolean getThisUserNew() {
        boolean n = thisUser.getNewUser();
        return n;
    }
    
    // ----- Setters
    public void setThisUserName(String nm) {thisUser.setUserName(nm);}
    public void setThisUserGameType(char gt) {thisUser.setGameType(gt);}
    public void setThisUserDifficulty(char df) {thisUser.setDifficulty(df);}
    public void setThisUserNew(boolean n) {thisUser.setNewUser(n);}
    
}
