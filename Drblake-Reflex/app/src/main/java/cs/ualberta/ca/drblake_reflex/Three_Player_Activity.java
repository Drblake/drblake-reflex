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
        Save_And_Load s = new Save_And_Load();
        s.saveWinner("Player 1",3);
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
        Save_And_Load s = new Save_And_Load();
        s.saveWinner("Player 2",3);
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
        Save_And_Load s = new Save_And_Load();
        s.saveWinner("Player 3",3);
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