import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private int score;
    public Score()
    {
        score = 0;
    }
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        showScore();
    }    
    public void increaseScore()
    {
        score++;
    }
    public void showScore()
    {
        setImage(new GreenfootImage("" + score, 50, Color.WHITE, null));
    }
}
