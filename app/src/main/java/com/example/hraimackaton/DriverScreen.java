package com.example.hraimackaton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DriverScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_screen);

//        TextView textView = findViewById(R.id.textViewDriver);
//        textView.setText("I DRIVE");
    }

    public void sendDriverInfo(View view) {
        EditText nameField = (EditText) findViewById(R.id.textViewDriverName);
        String name = nameField.getText().toString();
        EditText faceBookField = (EditText) findViewById(R.id.textViewFacebook);
        String facebook = nameField.getText().toString();
        EditText fromField = (EditText) findViewById(R.id.textViewFrom);
        String from = fromField.getText().toString();
//        EditText destinationField = (EditText) findViewById(R.id.textViewDestination);
//        String destination = destinationField.getText().toString();
//        EditText minLeaveField = (EditText) findViewById(R.id.textViewMinHour);
//        minLeave
//        TextView show = findViewById(R.id.textView);
//        show.setText(name);
    }
}
