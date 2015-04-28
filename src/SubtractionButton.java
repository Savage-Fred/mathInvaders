import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Subtraction button for difficulty menu.
 * 
 * @author Will McCarty
 * @version 2.1
 */
public class SubtractionButton extends DifficultyButton
{
    private char difficulty;
    
    public SubtractionButton(int width, int height, char dif) {
        super(width, height, dif);
        setDifficulty(dif);
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            difficulty = 's';
            Greenfoot.setWorld(new StartGameMenu('r','s'));
        }
    }
    
    private void setDifficulty(char dif) { difficulty = dif;}
    public char getDifficulty() {return difficulty;}
}
