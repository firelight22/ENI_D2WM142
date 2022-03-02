package com.example.mod4demodatabinding;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.mod4demodatabinding.databinding.ActivityMainBinding;

public class MainActivityJV extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setUser(new Utilisateur(54,"Quentin","ROUET"));
    }
}
