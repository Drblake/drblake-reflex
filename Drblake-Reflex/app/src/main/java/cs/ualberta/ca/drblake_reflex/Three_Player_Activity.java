package cs.ualberta.ca.drblake_reflex;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Three_Player_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_player);
    }

    public void OnePlayer3(View v) {
        //SAVE HERE
        //http://www.tutorialspoint.com//android/android_alert_dialoges.htm
        //Creates an alert dialogue
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        //Creates message for user
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setMessage("One Player Wins!");
        //Sets escape button for pop-up to "OK"
        alertDialogBuilder.setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                //Once pop-up is exited, calls startGame(); function
            }
        }).show();
    }

    public void TwoPlayer3(View v) {
        //SAVE HERE
        //http://www.tutorialspoint.com//android/android_alert_dialoges.htm
        //Creates an alert dialogue
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        //Creates message for user
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setMessage("Two Player Wins!");
        //Sets escape button for pop-up to "OK"
        alertDialogBuilder.setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                //Once pop-up is exited, calls startGame(); function
            }
        }).show();
    }

    public void ThreePlayer3(View v) {
        //SAVE HERE
        //http://www.tutorialspoint.com//android/android_alert_dialoges.htm
        //Creates an alert dialogue
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        //Creates message for user
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setMessage("Three Player Wins!");
        //Sets escape button for pop-up to "OK"
        alertDialogBuilder.setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                //Once pop-up is exited, calls startGame(); function
            }
        }).show();
    }
}