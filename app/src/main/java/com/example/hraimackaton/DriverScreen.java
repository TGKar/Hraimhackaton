package com.example.hraimackaton;


import android.os.Bundle;

public class DriverScreen extends InputActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_screen);
    }

    public boolean isDriver() {
        return true;
    }
}
