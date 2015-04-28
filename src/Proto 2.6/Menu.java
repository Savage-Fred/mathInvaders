import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Basic Menu from which all other menu classes are derived. 
 * @author Will McCarty
 * @version Version 4/10/2015 ver 1
 */
public class Menu extends World
{
    // Create an empty UserInfo class. 
    //private UserInfo userInfo = new UserInfo();
    /**
     * basic Menu constructor that builds an 800 x 600 pixel grid. 
     */
    public Menu()
    {   
        super(800, 600, 1); 
        startTheMusic1();
    }
    
    private static GreenfootSound bgMusic = new GreenfootSound("nostro-28.wav");
 
    public static void startTheMusic1()
    {
        bgMusic.playLoop();
    }
 
    public static void stopTheMusic1()
    {
        bgMusic.stop();
    }


    
    //public UserInfo getUserInfo() {return userInfo;}
}