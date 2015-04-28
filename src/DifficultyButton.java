import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class for choosing type of problems in regular mode. Gives options for additon, subtraction, 
 * multiplication, and division.
 * 
 * @author Will McCarty
 * @version 4/10/2015 version 2
 */
public class DifficultyButton extends Button
{
    private char difficulty;
    private char difficultyClicked;
    protected boolean wasClicked;
    protected GreenfootImage diffImage;
    
    /**
     * DifficultyButton Constructor.
     * @param width for width of box as int.
     * @param height int for height of button.
     * @param dif char for difficulty (a,s,d,m).
     */
    public DifficultyButton(int width, int height, char dif) {
        super(width, height);
        difficulty = dif;
        //setDiffImage(dif);
    }
    
    /**
     * setDiffImage sets the image for the button.
     */
    
    private void setDiffImage(char dif) {
       if(dif == 'a') {
            GreenfootImage diffImage = new GreenfootImage("Addition.jpg");
        }
       else if (dif == 's') {
            GreenfootImage diffImage = new GreenfootImage("Subtraction.png");
        }
       else if (dif == 'd') {
            GreenfootImage diffImage = new GreenfootImage("Division.png");
        }
       else if (dif == 'm') {
            GreenfootImage diffImage = new GreenfootImage("Multiplication.png");    
       }
       
      setImage(diffImage);
    }
    
    /**
     * Act - do whatever the DifficultyButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       wasClicked = Greenfoot.mouseClicked(this);
       if (wasClicked) {
           this.difficultyClicked = this.difficulty;
           Greenfoot.setWorld(new StartGameMenu('r', getUserDiff()));
       }
    }
    
    public char getUserDiff() {
        return this.difficultyClicked;
    }
}
