/*This file is part of Drblake-reflex.

    Drblake-reflex is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Drblake-reflex is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Drblake-reflex.  If not, see <http://www.gnu.org/licenses/>.*/
package cs.ualberta.ca.drblake_reflex;

import java.util.Random;
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
        s.saveReaction(System.currentTimeMillis()-time);
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

