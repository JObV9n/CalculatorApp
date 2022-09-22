  package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.service.controls.actions.FloatAction;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    TextView result;
    public View view;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.rView);
    }

    public void buEvent(View view) {
        this.view = view;
        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());

        int Sum = n1+n2;

        result.setText(String.valueOf(Sum));
    }
    public void buEvent1(View view) {
        this.view=view;
        float  n1 =Float.parseFloat(e1.getText().toString());
        float  n2 = Float.parseFloat(e2.getText().toString());

        float  Subtract = n1-n2;

        result.setText(String.valueOf(Subtract));
    }
    public void buEvent2(View view) {
        this.view = view;
        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());

        int Multiply = n1*n2;

        result.setText(String.valueOf(Multiply));
    }
    public void buEvent3(View view) {
        this.view = view;
        float n1 = Float.parseFloat(e1.getText().toString());
        float n2 = Float.parseFloat(e2.getText().toString());

        float divide = n1/n2;

        result.setText(String.valueOf(divide));
    }
}