import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.Scanner;
/**
 * Write a description of class UserInput here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserInput extends Actor
{
    String input = "";
    Scanner scan = new Scanner(System.in);
    static int answ;
    public UserInput()
    {
        
        setImage(new GreenfootImage("ANSWER", 30, Color.MAGENTA, null));
    }
    /**
     * Act - do whatever the UserInput wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        String i2 = Greenfoot.getKey();
        if (i2 == "backspace")
        {
            input = "";
        }
        if (i2 != null && i2 != "backspace")
        { 
            input += i2;
        }
        setImage(new GreenfootImage(input, 30, Color.MAGENTA, null));
        try
        {
            if (input != null && input != "" && input != "backspace")
            {
            answ = Integer.parseInt(input);
            }
        }
        catch (NumberFormatException e)
        {
            input = "";
        }
    }    
   
}
