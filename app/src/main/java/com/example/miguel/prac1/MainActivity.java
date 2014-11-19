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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends Activity {


    EditText edit1, edit2, edit3;
    ImageView img1;
    String name, surname,age;
    Intent btnIntent;
    Bitmap imag;
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

    public void button1OnClick(View v) {
        edit1 = (EditText) findViewById(R.id.editText);
        edit2 = (EditText) findViewById(R.id.editText2);
        edit3 = (EditText) findViewById(R.id.editText3);
        name = edit1.getText().toString();
        surname = edit2.getText().toString();
        age = edit3.getText().toString();
        btnIntent = new Intent(getApplicationContext(), MainActivity2.class);
        btnIntent.putExtra("NAME",name);
        btnIntent.putExtra("SURNAME",surname);
        btnIntent.putExtra("AGE",age);
        startActivity(btnIntent);
    }

    public void button2OnClick(View v) {
        edit1 = (EditText) findViewById(R.id.editText);
        edit2 = (EditText) findViewById(R.id.editText2);
        edit3 = (EditText) findViewById(R.id.editText3);
        name = edit1.getText().toString();
        surname = edit2.getText().toString();
        age = edit3.getText().toString();
        btnIntent = new Intent(getApplicationContext(), MainActivity3.class);
        btnIntent.putExtra("NAME",name);
        btnIntent.putExtra("SURNAME",surname);
        btnIntent.putExtra("AGE",age);
        startActivity(btnIntent);
    }

    public void button3OnClick(View v) {
        edit1 = (EditText) findViewById(R.id.editText);
        edit2 = (EditText) findViewById(R.id.editText2);
        edit3 = (EditText) findViewById(R.id.editText3);
        name = edit1.getText().toString();
        surname = edit2.getText().toString();
        age = edit3.getText().toString();
        btnIntent = new Intent(getApplicationContext(), MainActivity4.class);
        btnIntent.putExtra("NAME",name);
        btnIntent.putExtra("SURNAME",surname);
        btnIntent.putExtra("AGE",age);
        startActivity(btnIntent);
    }

    public void button4OnClick(View v) {
        btnIntent = new Intent(getApplicationContext(), MainActivity5.class);
        btnIntent.putExtra("IMG","descarga");
        startActivity(btnIntent);
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
