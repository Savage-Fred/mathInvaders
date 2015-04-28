import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Addition Button. Button for difficulty menu. 
 * 
 * @author Will McCarty
 * @version 1
 */
public class AdditionButton extends DifficultyButton
{
    private char difficulty;
    
    public AdditionButton(int width, int height, char dif) {
        super(width, height, dif);
        setDifficulty(dif);
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            difficulty = 'a';
            Greenfoot.setWorld(new StartGameMenu('r','a'));
        }
    }
    
    private void setDifficulty(char dif) { difficulty = dif;}
    public char getDifficulty() {return difficulty;}
}
