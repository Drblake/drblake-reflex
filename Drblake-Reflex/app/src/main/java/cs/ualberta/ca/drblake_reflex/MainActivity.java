package cs.ualberta.ca.drblake_reflex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onePlayer(View view){
        Intent i = new Intent(MainActivity.this ,One_Player_Activity.class);
        startActivity(i);
    }

    public void twoPlayer(View view){
        Intent j = new Intent(MainActivity.this ,Two_Player_Activity.class);
        startActivity(j);
    }

    public void threePlayer(View view){
        Intent k = new Intent(MainActivity.this ,Three_Player_Activity.class);
        startActivity(k);
    }

    public void fourPlayer(View view){
        Intent l = new Intent(MainActivity.this ,Four_Player_Activity.class);
        startActivity(l);
    }

    public void statistics(View view){
        Intent i = new Intent(MainActivity.this ,Statistics_Activity.class);
        startActivity(i);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
