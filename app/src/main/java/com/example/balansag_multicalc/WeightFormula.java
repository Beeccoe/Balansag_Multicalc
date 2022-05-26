package com.example.balansag_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WeightFormula extends AppCompatActivity implements View.OnClickListener{
    Button btnCalcWeight;
    EditText valueofmWeight, valueofg;
    TextView txtresultWeight;

    Formulas formulas = new Formulas();
    Parts allparts = new Parts();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_weight_formula);

        //Button
        btnCalcWeight = findViewById(R.id.btnCalcWeight);

        //EditText
        valueofmWeight = findViewById(R.id.valueofmWeight);
        valueofg = findViewById(R.id.valueofg);

        //TextView
        txtresultWeight = findViewById(R.id.txtresultWeight);

        btnCalcWeight.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCalcWeight:
                allparts.setMass2(Double.parseDouble(valueofmWeight.getText().toString()));
                allparts.setGravity(Double.parseDouble(valueofg.getText().toString()));
                double answer=formulas.Weight(allparts.getMass2(), allparts.getGravity());
                txtresultWeight.setText(""+answer);
                break;
        }
    }
}