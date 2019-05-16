package com.example.hraimackaton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RiderScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_screen);
        TextView textView = findViewById(R.id.textViewRider);
        textView.setText("I RIDE");
    }
}
