package com.example.mussic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

@SuppressLint("CustomSplashScreen")
public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread=new Thread(){
          public void run(){
              try{
                  sleep(3000);
                  Intent intent=new Intent(splashActivity.this,MainActivity.class);
                  startActivity(intent);
                  finish();
              }catch (InterruptedException e){
                  e.printStackTrace();
              }

          }
        };thread.start();
    }
}