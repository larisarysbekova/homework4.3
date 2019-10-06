package com.example.lesson31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public abstract class SecondActivity extends AppCompatActivity {
TextView textView;
String resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.resultTextViev);
        Intent intent = getIntent();
        resultText = intent.getStringExtra("textKey");
        textView.setText(resultText);

    }
    public void openCalculator(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void onButtonClickkkkkkk(View view) {
    }
}



