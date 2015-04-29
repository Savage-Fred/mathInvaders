import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.awt.Color;

/**
 * Space. Something for rockets to fly in...
 * 
 * @author Michael Kolling
 */
public class Arcade extends World
{
    static int missed;
    static int count;
    private static GreenfootSound gameMusic = new GreenfootSound("intro-responder.mp3");
    public Arcade() 
    {
        super(800, 600, 1, false);
        //GreenfootImage background = getBackground();
        setBackground("Background.jpg");
        //background.fill();
        //createStars(300);
        Explosion.initialiseImages();
        Menu.stopTheMusic1();
       missed = 0;
       addObject(new User(), 400, 595);
       addObject(new UserInput(), 400, 590);
       addObject(new BuzzTimer(60000), 730, 25);
       
       addObject(new Score(), 730, 50);
       count = 0;
       //Greenfoot.playSound("intro-responder.mp3");
       startTheMusic2();
    }
    public static void startTheMusic2()
    {
        gameMusic.playLoop();
    }
    public static void stopTheMusic2()
    {
        gameMusic.stop();
    }
    private void createStars(int number) 
    {
        GreenfootImage background = getBackground();             
        for(int i=0; i < number; i++) {            
             int x = Greenfoot.getRandomNumber( getWidth() );
             int y = Greenfoot.getRandomNumber( getHeight() );
             int color = 150 - Greenfoot.getRandomNumber(120);
             background.setColorAt(x,y,new Color(color,color,color));
        }
    }
    public void act() 
    {
       count++;
       
       if (count % 100 == 0)
        {
            
            int x = Greenfoot.getRandomNumber(4);
            if (x == 0)
            {
                addObject(new Division(), Greenfoot.getRandomNumber(600) + 100, 0); 
            }
            else if (x == 1)
            {
                addObject(new Subtraction(), Greenfoot.getRandomNumber(600) + 100, 0); 
            }
            else if (x == 2)
            {
                addObject(new Multiplication(), Greenfoot.getRandomNumber(600) + 100, 0); 
            }
            else 
            {
                addObject(new Addition(), Greenfoot.getRandomNumber(600) + 100, 0); 
            }
        }
       if (count == 6000)
       {
           //Greenfoot.stop();
       }
       
       // Pause Menu 
       //if (Greenfoot.isKeyDown("p")) {
         //  addObject(new PauseMenu(), 100, 200);
           //Greenfoot.stop();
       //}
    } 
}