package com.example.assignment3async;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextPage(View view) {
        EditText p1  = findViewById(R.id.text1);
        EditText p2  = findViewById(R.id.text2);
        EditText p3  = findViewById(R.id.text3);

        String json = "{\n" +
                "\"id:\"" + p1.getText().toString() + ",\n" +
                "\"title:\"" + p2.getText().toString() + ",\n" +
                "\"body:\"" + p3.getText().toString() + "\n" +
                "}";

        new AsyncT(this, json).execute();
    }
}
