import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * BackButton class returns user to the previous menu page or to the homepage. 
 * Known issues: going back will cause loss of information. 
 * Need to fix constructors for menus so that information is preserved.
 * 
 * @author Will McCarty
 * @version 4/10/2015 Version 1.
 */
public class BackButton extends Button
{
    //---- FIELDS
    /** currClass is a String representing the current the constructor is called from. */
    String currClass;
    /** returnClass is a String representing the world we want to go back to. */
    String returnClass;
    /** wasClicked is boolean if button clicked. */
    boolean wasClicked;
    //----- END FIELDS
    
    //------ CONSTRUCTORS
    /** basic empty constructor for backbutton. Returns to home. 
     * @param w int for width of button rectangle.
     * @param h int for height of button rectangle.
     */
    public BackButton(int w, int h) {
        super(w,h);
        currClass = null;
        returnClass = "OpenMenu";
        wasClicked = false;
    }
    
    /** Constructor for BackButton with return and current worlds as params. 
     * creates button of size w*h and gets the current world name and goes back to the previous world.
     * @param w int for width of button rectangle.
     * @param h int for height of button rectangle.
     * @param curCl String for the name of the current world. 
     * @param retCl String for name of world we want to return to.
     */
    public BackButton(int w, int h, String curCl, String retCl) {
        super(w,h);
        currClass = curCl;
        returnClass = retCl;
        wasClicked = false;
    }
    //------ END CONSTRUCTORS
    
    //------ METHODS 
    /**
     * act method checks for click and gets the current world. It returns to the previous page.
     */
    public void act() 
    {
        wasClicked = Greenfoot.mouseClicked(this);
        if (wasClicked) {
            if (currClass == null) {
                Greenfoot.setWorld(new OpenMenu());
            } else if (currClass.equalsIgnoreCase("GameTypeMenu")) { //game menu -> opening menu
                Greenfoot.setWorld(new OpenMenu());
            } else if (currClass.equalsIgnoreCase("DifficultyMenu")) { // difficulty menu -> game type menu
                Greenfoot.setWorld(new GameTypeMenu());
            } else if (currClass.equalsIgnoreCase("StartGameMenu")) { // Start Game -> Difficulty
                Greenfoot.setWorld(new DifficultyMenu());
            } else {
                Greenfoot.setWorld(new OpenMenu());
            }
        }
    } 
   //------ END METHODS
}
