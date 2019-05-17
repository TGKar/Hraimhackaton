package com.example.hraimackaton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RiderScreen extends InputActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Catch a Ride!");
        setContentView(R.layout.activity_rider_screen);


    }

    public boolean isDriver() {
        return false;
    }

    public void toRideGot(View view) {
        Intent intent = new Intent(this, got_ride_activity.class);
        startActivity(intent);
    }

//    public void found(View view) {
//        Intent intent = new Intent(this, FoundDriver1.class);
//        startActivity(intent);
//    }
}