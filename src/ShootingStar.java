import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShootinStar here.
 * This class generates shooting stars for the menu. They move from random edges of the screen and 
 * then are destroyed when they reach the other edge. 
 * 
 * 
 * @author William McCarty
 * @version Version 1.0
 */
public class ShootingStar extends Actor
{
    int randx = 0;
    int randy = 0;
    int startx = 0;
    int starty = 0;
    /**
     * Constructor for the shooting star class.
     */
    public ShootingStar(int x, int y) {
        startx = x;
        starty = y;
        randx = Greenfoot.getRandomNumber(800);
        randy = Greenfoot.getRandomNumber(600);
    }
    
    /**
     * Act - do whatever the ShootinStar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
}
