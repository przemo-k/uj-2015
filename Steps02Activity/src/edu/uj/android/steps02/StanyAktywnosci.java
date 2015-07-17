package edu.uj.android.steps02;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class StanyAktywnosci extends Activity {

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myfirstlayout); //Przygotowanie interfejsu graficznego
//        Button b = new Button(this);
//        b.setText("hop hop hop");
//        setContentView(b);
        String txt = getString(R.string.hello);
        
        Log.d("StanyAktywnosci", "onCreate()");
        Log.d("StanyAktywnosci", getString(R.string.cos_o_ali));
        
        if ( savedInstanceState != null && savedInstanceState.getBoolean("test", false) ) {
            Toast.makeText(this, "Hop hop hop", Toast.LENGTH_LONG).show();
        }
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("StanyAktywnosci", "onStart()");
    }
    
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("StanyAktywnosci", "onStop()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("StanyAktywnosci", "onPause()");
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("StanyAktywnosci", "onResume()");
    }
    
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("StanyAktywnosci", "onRestart()");
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("StanyAktywnosci", "onDestroy()");
    }
    
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("test", true);
        Log.d("StanyAktywnosci", "onSaveInstanceState()");
    }
    
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("StanyAktywnosci", "onRestoreInstanceState()");
    }
}