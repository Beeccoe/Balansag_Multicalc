package com.example.balansag_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewtonFormula extends AppCompatActivity implements View.OnClickListener{

    Button btnCalcNewton;
    EditText valueofmNewton, valueofA;
    TextView txtresultNewton;

    Formulas formulas = new Formulas();
    Parts allparts = new Parts();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_newton_2ndformula);

        //Button
        btnCalcNewton = findViewById(R.id.btnCalcNewton);

        //EditText
        valueofmNewton = findViewById(R.id.valueofmNewton);
        valueofA = findViewById(R.id.valueofA);

        //TextView
        txtresultNewton = findViewById(R.id.txtresultNewton);

        btnCalcNewton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCalcNewton:
                allparts.setMass1(Double.parseDouble(valueofmNewton.getText().toString()));
                allparts.setAcceleration(Double.parseDouble(valueofA.getText().toString()));
                double answer=formulas.Newton(allparts.getMass1(),allparts.getAcceleration());
                txtresultNewton.setText(""+answer);
                break;
        }
    }
}