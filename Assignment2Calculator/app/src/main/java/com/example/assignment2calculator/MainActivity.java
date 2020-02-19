package com.example.assignment2calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs", 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // pref.edit().putString("setting1", "value");
        //pref.getString("setting1", null);

        setContentView(R.layout.activity_main);
    }
}
