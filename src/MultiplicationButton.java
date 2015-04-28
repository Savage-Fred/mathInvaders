import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MultiplicationButton creates mult. button for difficulty menu.
 * 
 * @author Will McCarty
 * @version 1.1
 */
public class MultiplicationButton extends DifficultyButton
{
    private char difficulty;
    
    public MultiplicationButton(int width, int height, char dif) {
        super(width, height, dif);
        setDifficulty(dif);
    }
    
    private void setDifficulty(char dif) { difficulty = dif;}
    public char getDifficulty() {return difficulty;}
    /**
     * Act - do whatever the MultiplicationButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            difficulty = 'm';
            Greenfoot.setWorld(new StartGameMenu('r','m'));
        }
    }
}
