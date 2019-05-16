package com.example.hraimackaton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FoundDriver1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_found_driver1);
    }

    public void agreeToDriver(View view) {
        Intent intent = new Intent(this, DriverScreen.class);
        startActivity(intent);
    }

    /*public void disagreeToDriver(View view) {
        Intent intent = new Intent(this, DriverScreen.class);
        startActivity(intent);
    }*/
}
