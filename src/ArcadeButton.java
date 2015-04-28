import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ArcadeButton here.
 * 
 * @author Will McCarty
 * @version 4/10/2015 Version 1
 */
public class ArcadeButton extends Button
{
    private char gameType;
    /**
     * Act - do whatever the ArcadeButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ArcadeButton(int width, int height) {
        super(width, height);
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            //thisUser.setDifficulty('a');
            Greenfoot.setWorld(new StartGameMenu('a'));
            gameType = 'a';
        }
    }
    
    public char getGameType() {
        return gameType;
    }
}
