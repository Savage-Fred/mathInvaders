import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Subtraction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Subtraction extends Problem
{
    int n1;
    int n2;
    int answer;
    public Subtraction()
    {
        int n1 = Greenfoot.getRandomNumber(RANGE);
        int n2 = Greenfoot.getRandomNumber(RANGE);
        if (n1 >= n2)
        {
        setImage(new GreenfootImage(n1 + " - " + n2, 30, Color.WHITE, null));
        answer = n1 - n2;
        }
        else if (n2 > n1)
        {
            setImage(new GreenfootImage(n2 + " - " + n1, 30, Color.WHITE, null));
            answer = n2 - n1;
        }
    }
    /**
     * Act - do whatever the Subtraction wants to do. This method is called whenever
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
