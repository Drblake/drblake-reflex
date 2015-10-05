package cs.ualberta.ca.drblake_reflex;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class One_Player_Activity extends Activity {
    public static final String PREFS_NAME = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player);
        //Calls function to display instructions for the game
        //http://stackoverflow.com/questions/5409595/how-do-i-show-an-alert-dialog-only-on-the-first-run-of-my-application
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        boolean dialogShown = settings.getBoolean("dialogShown", false);
        if (!dialogShown) {
            popup();
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean("dialogShown", true);
            editor.commit();
        }
        new runnable();
    }


    private void popup() {
        //http://www.tutorialspoint.com//android/android_alert_dialoges.htm
        //Creates an alert dialogue
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        //Creates message for user
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setMessage("This game will test your reaction time. Wait until the button turns green" +
                " and then press it as quickly as you can. Reaction times will be recorded and displayed on this" +
                " screen and in Statistics.");
        //Sets escape button for pop-up to "OK"
        alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                //startGame();
            }
        }).show();
    }
    public void buttonChange(){
        Button buttonReact = (Button) findViewById(R.id.reflexButton);
        buttonReact.setText("GO!");
        buttonReact.setBackgroundColor(Color.GREEN);
    }

    public void ButtonReset(View v) {
        //http://stackoverflow.com/questions/17189715/android-button-color-changing-on-onclick
        final Button buttonReact = (Button) findViewById(R.id.reflexButton);
        buttonReact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonReact.setText("WAIT");
                buttonReact.setBackgroundColor(Color.RED);
            }
        });
    }

    public void decideTime(int number) {
        //http://stackoverflow.com/questions/3072173/how-to-call-a-method-after-a-delay-in-android
        final Handler newTimer = new Handler();
        newTimer.postDelayed(new Runnable() {
            @Override
            public void run() {
                buttonChange();
            }
        }, number);
    }

    public int random() {
        //http://stackoverflow.com/questions/6029495/how-can-i-generate-random-number-in-specific-range-in-android
        Random number = new Random();
        int result = number.nextInt(2000-10) + 10;
        return result;
    }
}


