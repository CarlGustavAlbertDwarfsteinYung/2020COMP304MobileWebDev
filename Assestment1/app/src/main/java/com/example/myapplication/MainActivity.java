package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecy", "onCreate invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecy", "onResume invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecy", "onStart invoked");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecy", "onDestroy invoked");
    }

    protected void onPause() {
        super.onPause();
        Log.d("lifecy", "onPause invoked");
    }

    protected void onStop() {
        super.onStop();
        Log.d("lifecy", "onStop invoked");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("lifecy", "onRestart invoked");
}

    public void nextPage(View view) {
        EditText p  = findViewById(R.id.editText2);

        // created an intent object
        Intent i = new Intent(getApplicationContext(), WelcomeActivity.class);
        Log.d("test123", ""+p.getText());
        i.putExtra("USER", p.getText().toString());
        // start the intent
        startActivity(i);
    }
}
