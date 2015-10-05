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
    public static final Timer t = new Timer(10,10,2000);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player);
        //Calls function to display instructions for the game
        //http://stackoverflow.com/questions/5409595/how-do-i-show-an-alert-dialog-only-on-the-first-run-of-my-application
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        boolean dialogShown = settings.getBoolean("dialogShown", false);
        popup();
        //http://stackoverflow.com/questions/1921514/how-to-run-a-runnable-thread-in-android
    }
    public void begin(){
        final Handler handler = new Handler();
        Runnable r = new Runnable() {
            public void run() {
                buttonChange();
                handler.postDelayed(this, t.RandomTime());
            }
        };

        handler.postDelayed(r, t.RandomTime());
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
                begin();
            }
        }).show();
    }
    public void buttonChange(){
        t.start();
        Button buttonReact = (Button) findViewById(R.id.reflexButton);
        buttonReact.setText("GO!");
        buttonReact.setBackgroundColor(Color.GREEN);
    }

    public void ButtonReset(View v) {
        final long wait = t.ReactionTime();
        t.Reset();
        //http://stackoverflow.com/questions/17189715/android-button-color-changing-on-onclick
        final Button buttonReact = (Button) findViewById(R.id.reflexButton);
        buttonReact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonReact.setText("WAIT "+ wait);
                buttonReact.setBackgroundColor(Color.RED);
            }
        });
    }
}


