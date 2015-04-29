import greenfoot.*;
import java.awt.Color;
public class BuzzTimer extends Timer
{
    public BuzzTimer(int duration)
    {
        super(duration);
    }

    protected void onFinish()
    {
        Arcade.stopTheMusic2();
        Greenfoot.playSound("Bzz.mp3");
        Score.setScore(0);
        Greenfoot.stop();
    }
}
