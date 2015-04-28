import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World for choosing difficulty within Regular mode. 
 * Options for addition, subtraction, multiplication, and division.
 * Version 2.1 changes: fixed buttons. Linked to new gametypes. 
 * 
 * @author Will McCarty
 * @version 4/9/2015 version 2.1
 * 
 */
public class DifficultyMenu extends Menu
{
    AdditionButton add = new AdditionButton(195, 60, 'a');
    SubtractionButton sub = new SubtractionButton(195, 60, 's');
    MultiplicationButton mult = new MultiplicationButton(195, 60, 'm');
    DivisionButton div = new DivisionButton(195, 60, 'd');
    BackButton b = new BackButton(195, 60, "DifficultyMenu", "GameTypeMenu");

    /**
     * Constructor for objects of class DifficultyMenu.
     * Adds transparent buttons and a backbutton to the world. 
     */
    public DifficultyMenu()
    {
        addObject(add, 400, 250);
        addObject(sub, 400, 330);
        addObject(mult, 402, 410);
        addObject(div, 400, 490);
        //back button
        addObject(b, 25, 10);
    }
}
