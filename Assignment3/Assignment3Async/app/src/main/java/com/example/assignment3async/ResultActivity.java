package com.example.assignment3async;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tv = findViewById(R.id.textView);

        tv.setText("Hello " + getIntent().getExtras().getString("GET"));
    }
}
