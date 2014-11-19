package com.example.miguel.prac1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity5 extends Activity {
    ImageView img1;
    String imag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5);
       /* img1 = (ImageView) findViewById(R.id.imageView);
        imag = getIntent().getStringExtra("IMG");
        int iv1 = getResources().getIdentifier(imag, "drawable", getPackageName());
        Bitmap bm =((BitmapDrawable) getBaseContext().getResources().getDrawable(iv1)).getBitmap();
        img1.setImageBitmap(bm);*/
    }

    public void onBackClick4 (View v) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity5, menu);
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
