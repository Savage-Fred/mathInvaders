import greenfoot.*;

/**
 * The UserInfo Class stores information from the user's menu choices. 
 * @author Will McCarty
 * @version 1. 4/9/2015
 */
public class UserInfo  
{
    //----- Begin Fields -----
    
    /** String for the user's name either from previous save, or from selection of previous players. */
    private String userName;
    /** is the user new? */
    private boolean newUser;
    /** char for gameType (a for arcade, r for regular) */
    private char gameType;  
    /** char for difficulty (a,s,m,d,x) x for arcade difficulty. */
    private char difficulty;    
    /** field for storing formatted information for previous users. */
    private String scoreInformation;
    //----- End Fields -------
   
    public static StartGameButton start;
    // ------- Constructors -------
    
    /**
     * Empty UserInfo Constructor to initialize all values to empty or zero. 
     */
    public UserInfo() {
        this.setUserName("no User");
        this.setNewUser(false);
        this.setGameType('x');
        this.setDifficulty('x');
    }

    /**
     * UserInfo Constructor 
     * @param nm name of user.
     * @param nu boolean. Is user new?
     * @param type char for game type.
     * @param dif char for difficulty.
     */
    public UserInfo(String nm, boolean nu, char type, char dif)
    {
       userName = nm;
       newUser = nu;
       gameType = type;
       difficulty = dif;
    }
    
    //------ Setters
    public void setUserName(String nm) { userName = nm;}
    public void setGameType(char gt) {gameType = gt;}
    public void setDifficulty(char df) {difficulty = df;}
    public void setNewUser(boolean n) {newUser = n;}
    
    //------ Getters
    public String getUserName() {return userName;}
    public char getGameType() {return gameType;}
    public char getDifficulty() {return difficulty;}
    public boolean getNewUser() {return newUser;}
}






