package cs.ualberta.ca.drblake_reflex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set layout to default layout that displays menu
        setContentView(R.layout.activity_main);
        //Calls function to initialize all on-click listeners for menu buttons
        OnClickListeners();
    }

    public void OnClickListeners() {
        Button One_Player = (Button) findViewById(R.id.onePlayerButton);
        One_Player.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //http://stackoverflow.com/questions/24610527/how-do-i-get-a-button-to-open-another-activity-in-android-studio
                //changes activity to next One_Player
                startActivity(new Intent(MainActivity.this, One_Player_Activity.class));
            }
        });

        Button Two_Player = (Button) findViewById(R.id.twoPlayerButton);
        Two_Player.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //http://stackoverflow.com/questions/24610527/how-do-i-get-a-button-to-open-another-activity-in-android-studio
                //changes activity to next Two_Player
                startActivity(new Intent(MainActivity.this, Two_Player_Activity.class));
            }
        });

        Button Three_Player = (Button) findViewById(R.id.threePlayerButton);
        Three_Player.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //http://stackoverflow.com/questions/24610527/how-do-i-get-a-button-to-open-another-activity-in-android-studio
                //changes activity to next Three_Player
                startActivity(new Intent(MainActivity.this, Three_Player_Activity.class));
            }
        });

        Button Four_Player = (Button) findViewById(R.id.fourPlayerButton);
        Four_Player.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //http://stackoverflow.com/questions/24610527/how-do-i-get-a-button-to-open-another-activity-in-android-studio
                //changes activity to next Four_Player
                startActivity(new Intent(MainActivity.this, Four_Player_Activity.class));
            }
        });

        Button Statistics = (Button) findViewById(R.id.statisticsButton);
        Statistics.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //http://stackoverflow.com/questions/24610527/how-do-i-get-a-button-to-open-another-activity-in-android-studio
                //changes activity to next statistics
                startActivity(new Intent(MainActivity.this, Statistics_Activity.class));
            }
        });
    }
}