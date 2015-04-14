import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * StartGameButton is a button that starts the game with all of the information
 * about the gametype, difficulty, user, etc. 
 * 
 * Known issues: needs a lot of polishing for different game types.
 * Need to add: 
 *  functionality for gametypes other than arcade. 
 * 
 * @author Will McCarty
 * @version 4/10/2015 Version 1
 */
public class StartGameButton extends Button
{
    //----- FIELDS
    private char gameType, difficulty;
    private boolean wasClicked;
    //------ END FIELDS
    
    //------ CONSTRUCTORS
    /**
     * @param width int for button box.
     * @param height int for height of button box.
     * @param type char for gameType (a or r).
     * @param diff char for game difficulty (a,d,s,m).
     */
    public StartGameButton(int width, int height, char type, char diff) {
        super(height, width);
        gameType = type;
        difficulty = diff;
    }
    
    /**
     * Constructor for arcade mode without difficulty.
     * @param width of button box.
     * @param height of button box.
     * @param type char for game type. 
     */
    public StartGameButton(int width, int height, char type) {
        super(width, height);
        gameType = 'a';
    }
    
    /** 
     * Constructor that just takes height and width. Difficulty and type come form elsewhere.
     * This isn't finished. 
     * @param width int for width of text box.
     * @param height int for height of text box.
     */
    public StartGameButton(int width, int height) {
        super(height, width);
    }
    //------ END CONSTRUCTORS
    
    //------ METHODS
    /**
     * Act() method gets the type of game that the user wants and starts that 
     * game by building the world. 
     */
    public void act() 
    {
       wasClicked = Greenfoot.mouseClicked(this);
       if (wasClicked && gameType == 'a') {
           Greenfoot.setWorld(new Arcade());
       } 
       if (wasClicked && gameType  == 'r') {
          if (difficulty == 'a') {
              // start addition gametype.
          } 
          else if (difficulty == 's') {
              // start subtraction gametype.
          }
          else if (difficulty == 'm') {
              // statrt multiplication gametype.
          }
          else if (difficulty == 'd') {
              // start division gametype.
          }
       } 
    }
    
    //------ Setters
    //------ END METHODS
}
