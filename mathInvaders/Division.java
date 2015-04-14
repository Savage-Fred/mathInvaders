import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Division here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Division extends Problem
{
    int n1;
    int n2;
    int answer;
    public Division()
    {
        n1 = Greenfoot.getRandomNumber(RANGE);
        n2 = (Greenfoot.getRandomNumber(RANGE) + 1);
        while ((n1 % n2) != 0)
        {n1 = Greenfoot.getRandomNumber(RANGE);
         n2 = (Greenfoot.getRandomNumber(RANGE) + 1);
        }
         setImage(new GreenfootImage(n1 + " / " + n2, 30, Color.WHITE, null));
         answer = n1 / n2;
    }
    /**
     * Act - do whatever the Division wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + 1);
        int y = this.getY();
        checkAnswer();
        if ( y == 605)
        {
            getWorld().removeObject(this);
            Arcade.missed++;
        }
    }    
    public int getAnswer()
    {
        return answer;
    }
    public void checkAnswer()
    {
        int check = UserInput.answ;
        if (check == this.getAnswer())
        {
            getWorld().removeObject(this);
        }
    }
}
