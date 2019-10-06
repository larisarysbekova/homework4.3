package com.example.lesson31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText = findViewById(R.id.edit_text_1);

    Float Value1,Value2;
    boolean PLUS,MINUS,DIVIDE;
    String resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        EditText el1 = (EditText) findViewById(R.id.Num1);
        EditText el2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 + num2;
        resText.setText(Integer.toString(resSum));


    }

    public void onButtonClickk(View v2) {
        EditText el1 = (EditText) findViewById(R.id.Num1);
        EditText el2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 - num2;
        resText.setText(Integer.toString(resSum));


    }

    public void onButtonClickkk(View v3) {
        EditText el1 = (EditText) findViewById(R.id.Num1);
        EditText el2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 * num2;
        resText.setText(Integer.toString(resSum));


    }

    public void onButtonClickkkk(View v4) {
        EditText el1 = (EditText) findViewById(R.id.Num1);
        EditText el2 = (EditText) findViewById(R.id.Num2);
        TextView resText = (TextView) findViewById(R.id.Result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 / num2;
        resText.setText(Integer.toString(resSum));

    }

public void openSecondActivity(View view){
Intent intent = new Intent(this,SecondActivity.class);
intent.putExtra("textKey",Value1 + "+" + Value2 + "=" + resultText);
startActivityForResult(intent,2);
}
    }



