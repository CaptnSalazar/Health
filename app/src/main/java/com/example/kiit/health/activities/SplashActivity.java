package com.example.kiit.health.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kiit.health.tutorial.TutorialActivity;



public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent mainIntent = new Intent(SplashActivity.this, TutorialActivity.class);
        SplashActivity.this.startActivity(mainIntent);
        SplashActivity.this.finish();

    }

}
