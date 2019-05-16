package com.example.hraimackaton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toDriver(View view) {
        Intent intent = new Intent(this, DriverScreen.class);
        startActivity(intent);
    }

    public void toRider(View view) {
        Intent intent = new Intent(this, RiderScreen.class);
        startActivity(intent);
    }


}
