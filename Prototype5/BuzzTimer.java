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
        Greenfoot.playSound("Bzz.mp3");
        Greenfoot.stop();
    }
}
