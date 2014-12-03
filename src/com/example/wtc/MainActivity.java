package com.example.wtc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void emperor(View v) {
 	 	Intent intensaya = new  Intent(getApplicationContext(),EmperorActivity.class);
 	 	startActivity(intensaya);
 	 	}
 	 	 public void adanr(View v) {
 	 	 	Intent intensaya1 = new  Intent(getApplicationContext(),AdanRActivity.class);
 	 	 	startActivity(intensaya1);
 	 	 	}
 	 	 	 public void alexaboun(View v) {
 	 	 	 	Intent intensaya2 = new  Intent(getApplicationContext(),AlexabounActivity.class);
 	 	 	 	startActivity(intensaya2);
 	 	 	 	}

}
