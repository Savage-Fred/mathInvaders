import greenfoot.*;
import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
public abstract class Timer extends Actor
{
    static int duration; //The duration of the timer in milliseconds
    static final int fontSize = 50;
    long startTime = 0;
    boolean finished = false;

    public Timer(int duration)
    {
        this.duration = duration;
        setImage(new GreenfootImage(1, 1));
    }

    public void act()
    {
        if(finished) return;
        if(startTime == 0) startTime = System.currentTimeMillis();
        int diff = (int)(System.currentTimeMillis() - startTime);
        if(diff < duration) {
            String text = "";
            int val = (255*diff)/duration;
            if(val > 255) val = 255;
            if(val < 0) val = 0;
            int gVal = (val*val)/255;
            Color color = new Color(255 - val, gVal, 0);
            setImage(new GreenfootImage(getText(duration-diff), fontSize, color, new Color(0, 0, 0, 0)));
        } else {
            finished = true;
            setImage(new GreenfootImage(getText(0), fontSize, Color.GREEN, new Color(0, 0, 0, 0)));
            onFinish();
        }
    }
    
    protected abstract void onFinish();
    
    private static String getText(int time)
    {
        String total = "" + duration;
        String text = "" + time;
        while(text.length() < total.length()) text = "0" + text;
        if(text.length() > 3) text = text.substring(0, text.length()-3) + ":" + text.substring(text.length()-3, text.length());
        return text;
    }
    
    public static int getWidth(int duration)
    {
        return new GreenfootImage(getText(duration), fontSize, Color.BLACK, new Color(0, 0, 0, 0)).getWidth();
    }
}

