package com.example.balansag_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PowerFormula extends AppCompatActivity implements View.OnClickListener{
    Button btnCalcPower;
    EditText valueofW, valueofT;
    TextView txtresultPower;

    Formulas formulas = new Formulas();
    Parts allparts = new Parts();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_power_formula);

        //Button
        btnCalcPower = findViewById(R.id.btnCalcPower);

        //EditText
        valueofW = findViewById(R.id.valueofW);
        valueofT = findViewById(R.id.valueofT);

        //TextView
        txtresultPower = findViewById(R.id.txtresultPower);

        btnCalcPower.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCalcPower:
                allparts.setWork(Double.parseDouble(valueofW.getText().toString()));
                allparts.setTime(Double.parseDouble(valueofT.getText().toString()));
                double answer=formulas.Power(allparts.getWork(),allparts.getTime());
                txtresultPower.setText(""+answer);
                break;
        }
    }
}