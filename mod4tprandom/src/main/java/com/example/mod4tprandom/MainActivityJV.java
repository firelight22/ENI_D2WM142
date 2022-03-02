package com.example.mod4tprandom;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivityJV extends AppCompatActivity {
    EditText editTextMin, editTextMax;
    TextView textViewResultat;
    Button buttonGenerate;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMin = findViewById(R.id.editTextMin);
        editTextMax = findViewById(R.id.editTextMax);
        textViewResultat = findViewById(R.id.textViewResul);
        buttonGenerate = findViewById(R.id.buttonGenerate);
        buttonGenerate.setOnClickListener(this::computeRandom);
    }
    protected void computeRandom(View v){
        String minString = editTextMin.getText().toString();
        String maxString =editTextMax.getText().toString();
        int max = Integer.parseInt(minString);
        int min = Integer.parseInt(maxString);
        int randomInt = (int)((Math.random() * (max - min)) + min);
        textViewResultat.setText(String.valueOf(randomInt));

    }
}
