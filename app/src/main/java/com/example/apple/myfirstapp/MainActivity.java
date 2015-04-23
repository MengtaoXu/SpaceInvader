package com.example.apple.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
<<<<<<< HEAD
import android.view.View;
import android.content.Intent;
=======
import android.content.Intent;
import android.view.View;

>>>>>>> 2791fbe437c7b8c155dd5d177c07810b160e4f09

public class MainActivity extends ActionBarActivity {

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
<<<<<<< HEAD
    public void start(View view)
    {
        Intent intent = new Intent(this,GameActivity.class);
        startActivity(intent);


=======

    public void enterGame(View view){
        Intent intent = new Intent(this,GameActivity.class);
        startActivity(intent);
>>>>>>> 2791fbe437c7b8c155dd5d177c07810b160e4f09
    }
}
