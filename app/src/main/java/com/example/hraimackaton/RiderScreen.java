package com.example.hraimackaton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RiderScreen extends InputActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_screen);
    }

    public boolean isDriver() {
        return false;
    }


    public void found(View view) {
        Intent intent = new Intent(this, FoundDriver1.class);
        startActivity(intent);
    }
}