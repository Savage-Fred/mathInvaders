import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Division button for difficulty menu.
 * 
 * @author Will McCarty
 * @version 1.1
 */
public class DivisionButton extends DifficultyButton
{
    private char difficulty;
    
    public DivisionButton(int width, int height, char dif) {
        super(width, height, dif);
        setDifficulty(dif);
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            difficulty = 'd';
            Greenfoot.setWorld(new StartGameMenu('r','d'));
        }
    }
    
    private void setDifficulty(char dif) { difficulty = dif;}
    public char getDifficulty() {return difficulty;}
}
