package com.example.app7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSend(View view) {
        EditText userEditText = findViewById(R.id.user);
        EditText giftEditText = findViewById(R.id.gift);
        EditText nameEditText = findViewById(R.id.name);

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("username", userEditText.getText().toString());
        intent.putExtra("gift", giftEditText.getText().toString());
        intent.putExtra("name", nameEditText.getText().toString());

        startActivity(intent);
    }
}