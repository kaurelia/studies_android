package com.example.app7;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        setContentView(R.layout.second_activity);
        String user = "Jhon";
        String gift = "How are you";
        String name= "Jan";

        name = getIntent().getExtras().getString("name");
        user = getIntent().getExtras().getString("username");
        gift = getIntent().getExtras().getString("gift");

        TextView infoTextView = findViewById(R.id.textViewInfo);
        infoTextView.setText(user + ", send" + gift + " by " + name);
    }
}
