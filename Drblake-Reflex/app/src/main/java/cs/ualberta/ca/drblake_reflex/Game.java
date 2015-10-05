package cs.ualberta.ca.drblake_reflex;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import java.util.Random;
import java.util.TimerTask;

/**
 * Created by Dylan on 2015-10-04.
 */
public class Game {


    public void startGame() {
        startTimer(random());
        buttonChange();

    }

    public void buttonChange() {
        //http://stackoverflow.com/questions/17189715/android-button-color-changing-on-onclick
        final Button buttonReact = (Button) findViewById(R.id.reflexButton);
        buttonReact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonReact.setText("GO!");
                buttonReact.setBackgroundColor(Color.GREEN);

            }
        });
    }

    public void startTimer(int number) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                buttonChange();
            }
        },number);
    }

    public int random() {
        //http://stackoverflow.com/questions/6029495/how-can-i-generate-random-number-in-specific-range-in-android
        Random number = new Random();
        int result = number.nextInt(2000-10) + 10;
        return result;
    }
}
