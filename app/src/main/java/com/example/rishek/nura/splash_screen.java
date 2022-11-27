package com.example.rishek.nura;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class splash_screen extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spalsh_screen);
     new Handler().postDelayed(new Runnable() {
         @Override
         public void run() {
             Intent mainIntent=new Intent(splash_screen.this,MainActivity.class);
             splash_screen.this.startActivity(mainIntent);
             splash_screen.this.finish();
         }
     },SPLASH_DISPLAY_LENGTH);
}
}
