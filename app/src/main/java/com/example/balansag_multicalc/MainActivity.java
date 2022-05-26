package com.example.balansag_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnDensity, btnPower, btnNewton, btnWeight, btnAcceleration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        btnDensity = findViewById(R.id.btnDensity);
        btnPower = findViewById(R.id.btnPower);
        btnNewton = findViewById(R.id.btnNewton);
        btnWeight = findViewById(R.id.btnWeight);
        btnAcceleration = findViewById(R.id.btnAcceleration);

        btnDensity.setOnClickListener(this);
        btnPower.setOnClickListener(this);
        btnNewton.setOnClickListener(this);
        btnWeight.setOnClickListener(this);
        btnAcceleration.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnDensity:
                Intent intent=new Intent(MainActivity.this,DensityFormula.class);
                startActivity(intent);
                break;
            case R.id.btnPower:
                Intent intent1=new Intent(MainActivity.this,PowerFormula.class);
                startActivity(intent1);
                break;
            case R.id.btnNewton:
                Intent intent2=new Intent(MainActivity.this,NewtonFormula.class);
                startActivity(intent2);
                break;
            case R.id.btnWeight:
                Intent intent3=new Intent(MainActivity.this,WeightFormula.class);
                startActivity(intent3);
                break;
            case R.id.btnAcceleration:
                Intent intent4=new Intent(MainActivity.this,AccelerationFormula.class);
                startActivity(intent4);
                break;
        }
    }
}