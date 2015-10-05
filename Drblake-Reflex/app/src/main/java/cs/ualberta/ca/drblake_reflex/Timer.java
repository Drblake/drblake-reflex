package cs.ualberta.ca.drblake_reflex;

import java.util.Random;
import android.os.SystemClock;
/**
 * Created by Dylan on 2015-10-04.
 */
public class Timer{
    private long time = 10;
    private int min = 10;
    private int max = 2000;

    public Timer(int min, int max, long time) {
        this.time = time;
        this.min = min;
        this.max = max;

    }
    public void Reset(){
        start();
    }
    public long ReactionTime() {
        Save_And_Load s = new Save_And_Load();
        s.SaveReaction(System.currentTimeMillis()-time);
        return (System.currentTimeMillis()-time);
    }
    public long RandomTime(){
        return random(max,min);
    }

    public void start() {
        setTime(System.currentTimeMillis());
    }

    public int random(int max, int min) {
        //http://stackoverflow.com/questions/6029495/how-can-i-generate-random-number-in-specific-range-in-android
        Random number = new Random();
        return(number.nextInt(max-min) + min);
    }

    public void setTime(long time) {
        this.time = time;
    }
}

