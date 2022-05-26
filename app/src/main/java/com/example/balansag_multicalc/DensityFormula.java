package com.example.balansag_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DensityFormula extends AppCompatActivity implements View.OnClickListener {
    Button btnCalcDensity;
    EditText valueofM, valueofV;
    TextView txtresultDensity;

    Formulas formulas = new Formulas();
    Parts allparts = new Parts();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_density_formula);

        //Button
        btnCalcDensity = findViewById(R.id.btnCalcDensity);

        //EditTexts
        valueofM = findViewById(R.id.valueofM);
        valueofV = findViewById(R.id.valueofV);

        //TextView
        txtresultDensity = findViewById(R.id.txtresultDensity);

        btnCalcDensity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCalcDensity:
                allparts.setMass(Double.parseDouble(valueofM.getText().toString()));
                allparts.setVelocity(Double.parseDouble(valueofV.getText().toString()));
                double answer=formulas.Density(allparts.getMass(), allparts.getVelocity());
                txtresultDensity.setText(""+answer);
                break;
        }
    }
}