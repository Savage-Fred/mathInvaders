import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SubtractionWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SubtractionWorld extends World
{
    static int missed;
    static int score;
    /**
     * Constructor for objects of class SubtractionWorld.
     * 
     */
    public SubtractionWorld()
    {    
        super(800, 600, 1, false);
        setBackground("Background.jpg");
        Explosion.initialiseImages();
       missed = 0;
       addObject(new User(), 400, 595);
       addObject(new UserInput(), 400, 590);
    }
    public void act() 
    {
       if (Greenfoot.getRandomNumber(300) < 2)
        {
            addObject(new Subtraction(), Greenfoot.getRandomNumber(600) + 100, 0); 
        }
       if (missed == 5)
       {
           Greenfoot.stop();
       }
    } 
}
