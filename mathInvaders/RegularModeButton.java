
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ArcadeButton here.
 * 
 * @author Will McCarty
 * @version 4/10/2015 Version 1
 */
public class RegularModeButton extends Button
{
    private char gameType;
    /**
     * Act - do whatever the ArcadeButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public RegularModeButton(int width, int height) {
        super(width, height);
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new DifficultyMenu());
            gameType = 'r';
        }
    }
    
    public char getGameType() {
        return gameType;
    }
}
