package com.example.balansag_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AccelerationFormula extends AppCompatActivity implements View.OnClickListener{
    Button btnCalcAcceleration;
    EditText valueofvAcceleration, valueoftAcceleration;
    TextView txtresultAcceleration;

    Formulas formulas = new Formulas();
    Parts allparts = new Parts();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_acceleration_formula);
        btnCalcAcceleration = findViewById(R.id.btnCalcAcceleration);
        valueofvAcceleration = findViewById(R.id.valueofvAcceleration);
        valueoftAcceleration = findViewById(R.id.valueoftAcceleration);
        txtresultAcceleration = findViewById(R.id.txtresultAcceleration);
        btnCalcAcceleration.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCalcAcceleration:
                allparts.setVelocity1(Double.parseDouble(valueofvAcceleration.getText().toString()));
                allparts.setTime1(Double.parseDouble(valueoftAcceleration.getText().toString()));
                double answer = formulas.Acceleration(allparts.getVelocity1(), allparts.getTime1());
                txtresultAcceleration.setText("" + answer);
                break;

        }
    }
}