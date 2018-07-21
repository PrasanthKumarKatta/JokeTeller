package com.example.androidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyJokeDisplay extends AppCompatActivity {
    public static final String MYJOKE_KEY="key";
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_joke_display);

        if (getIntent().hasExtra(MYJOKE_KEY)) {
            text = findViewById(R.id.jokeText);
            String jok = getIntent().getStringExtra(MYJOKE_KEY);
            text.setText(jok);
        }
    }
}
