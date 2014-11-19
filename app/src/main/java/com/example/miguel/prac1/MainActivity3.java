package com.example.miguel.prac1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity3 extends Activity {
    String surname;
    TextView sname;
    Integer i=0;
    final Handler myHandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3);
        Bundle extras = getIntent().getExtras();
        surname = extras.getString("SURNAME");
        sname = (TextView) findViewById(R.id.textView2);
        sname.setText(surname);

        Timer myTimer = new Timer();
        myTimer.schedule(new TimerTask() {
            @Override
            public void run() {UpdateGUI();}
        }, 0, 1000);
    }

    private void UpdateGUI() {
        i++;
        //tv.setText(String.valueOf(i));
        myHandler.post(myRunnable);
    }

    final Runnable myRunnable = new Runnable() {
        public void run() {
            if (i%2== 0) {
                sname.setTextColor(Color.BLUE);
            } else {
                sname.setTextColor(Color.RED);
            }
        }
    };

    public void onBackClick2 (View v) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity3, menu);
        return true;
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
