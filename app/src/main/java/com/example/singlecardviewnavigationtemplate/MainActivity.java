package com.example.singlecardviewnavigationtemplate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CompleteViewModel completeViewModel = new ViewModelProvider(this).get(CompleteViewModel.class);
    }
}