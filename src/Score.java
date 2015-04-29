import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version 1.1
 *  -Will - Added getter to use in EndGameWorld
 */
public class Score extends Actor
{
    private static int score;
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
    public static void setScore(int scoreIn)
    {
        score = scoreIn;
    }
    public void showScore()
    {
        score = Addition.addScore + Division.divScore + Multiplication.multScore + Subtraction.subScore;
        setImage(new GreenfootImage("" + score, 50, Color.WHITE, null));
    }
    
    public int getScore() {return this.score;}
}
