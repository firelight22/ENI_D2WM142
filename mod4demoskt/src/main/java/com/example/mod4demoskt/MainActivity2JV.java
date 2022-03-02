package com.example.mod4demoskt;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2JV extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText);
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        Button button2 = findViewById(R.id.button2);
        textView.setText("Hello");
        editText.setText("Comment allez-vous?");
        ratingBar.setRating(3f);
        button2.setOnClickListener(this::onClickButton);
    }
    public void onClickButton(View view){
        Toast.makeText(this, "J'ai appuyé sur un bouton :D", Toast.LENGTH_SHORT).show();
    }
}
