package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView text;
private EditText inputName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
        inputName = findViewById(R.id.editTextTextPersonName);

    }

    public void onClick(View view) {
        if(inputName.getText().length() == 0){
            text.setText("Hello Gray cat");
        }else{
            text.setText("Hi " + inputName.getText());
        }
    }
}