package com.example.mockitotest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int yearDays(int today){

        int days = today+265;
        return days;
    }

    public String fullName(String input){
        String fullName = input+" " +"masoumii";
        return fullName;
    }
}
