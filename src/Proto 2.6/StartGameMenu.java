import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World with one button to start game with chosen options
 * 
 * @author Will McCarty
 * @version 4/10/2015 Version 1
 */
public class StartGameMenu extends Menu
{
    //----- Fields
    private char gameType;
    private char difficulty;
    BackButton back = new BackButton(195, 60, "StartGameMenu", "GameTypeMenu");
    StartGameButton startReg;
    StartGameButton startArc = new StartGameButton(195, 60, gameType);
    //----- End Fields
    
    //----- CONSTRUCTORS 
    /**
     * Empty Constructor for StartGameMenu
     */
    public StartGameMenu() {
        super();
    }
    
    /**
     * StartGameMenu Constructor for arcade mode. 
     * @param type char for type of game.
     */
    public StartGameMenu(char type) {
        gameType = type;
        difficulty = 'x';
        
        addObject(startArc, 400, 300);
        addObject(back, 25, 10);
    }
    
    /** 
     * Constructor for StartGameMenu that includes gametype and difficulty. 
     * @param type char for type of game ('a' or 'r').
     * @param diff char for difficulty ('a', 's', 'm', 'd', or 'x' for arcade);
     */
    public StartGameMenu(char type, char diff) {
        StartGameButton startReg = new StartGameButton(195, 60, type, diff);
        addObject(startReg, 400, 300);
        addObject(back, 25, 10);
        
    }
    
    //---- END CONSTRUCTORS
}
