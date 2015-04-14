import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World for choosing difficulty within Regular mode. 
 * Options for addition, subtraction, multiplication, and division.
 * 
 * @author Will McCarty
 * @version 4/9/2015 version 1
 */
public class DifficultyMenu extends Menu
{
    DifficultyButton add = new DifficultyButton(195, 60, 'a');
    DifficultyButton sub = new DifficultyButton(195, 60, 's');
    DifficultyButton mult = new DifficultyButton(195, 60, 'm');
    DifficultyButton div = new DifficultyButton(195, 60, 'd');
    BackButton b = new BackButton(195, 60, "DifficultyMenu", "GameTypeMenu");

    /**
     * Constructor for objects of class DifficultyMenu.
     * Adds transparent buttons and a backbutton to the world. 
     */
    public DifficultyMenu()
    {
        addObject(add, 400, 250);
        addObject(sub, 400, 330);
        addObject(mult, 400, 410);
        addObject(div, 400, 490);
        //back button
        addObject(b, 25, 10);
    }
}
