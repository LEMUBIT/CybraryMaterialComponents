package com.lemubit.lemuel.cybrarymaterialcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView textView = findViewById(R.id.textView);
        String name = getIntent().getStringExtra("personName");
        textView.setText(name);
    }
}
