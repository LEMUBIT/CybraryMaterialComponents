package com.lemubit.lemuel.cybrarymaterialcomponents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        final TextInputEditText textInputEditText = findViewById(R.id.eTxtUserName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = textInputEditText.getText().toString();
                Intent intent = new Intent(MainActivity.this, Activity2.class);

                intent.putExtra("personName", name);
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivity.this, textInputEditText, "name");
                startActivity(intent, options.toBundle());
            }
        });
    }
}
