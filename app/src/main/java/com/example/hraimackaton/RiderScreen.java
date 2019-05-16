package com.example.hraimackaton;

import android.os.Bundle;

public class RiderScreen extends InputActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_screen);
    }

    public boolean isDriver() {
        return false;
    }
}