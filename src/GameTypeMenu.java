import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Menu for different game types. Currently Either Arcade or Regular.
 * @author William McCarty
 * @version 4/10/2015 version 1
 */

public class GameTypeMenu extends Menu
{
    ArcadeButton a = new ArcadeButton(195,60);
    RegularModeButton r = new RegularModeButton(195, 60);
    BackButton b = new BackButton(195, 60, "GameTypeMenu", "OpenMenu");

    /**
     * Constructor for objects of class GameTypeMenu.
     * 
     */
    public GameTypeMenu()
    {
        super();
        addObject(a, 200, 300);
        addObject(r, 600, 300);
        addObject(b, 25, 10);
    }
}
