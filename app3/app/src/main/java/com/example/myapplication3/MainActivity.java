package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mInfTextView;
    private Button nElephantCounterButton;
    private int nCount = 0;
    private int nCount1 = 0;
    private Button button;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInfTextView = findViewById(R.id.textView);
        nElephantCounterButton = findViewById(R.id.button2);
        button = findViewById(R.id.button);
        button3 = findViewById(R.id.button3);
        nElephantCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mInfTextView.setText("I can see " + ++nCount + "elephants");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mInfTextView.setText("I can see " + ++nCount1 + "clouds");
            }
        });
    }

    public void onClick(View view) {
        mInfTextView.setText("hello cat");
    }


}