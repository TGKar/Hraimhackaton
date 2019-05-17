package com.example.hraimackaton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public abstract class InputActivity extends AppCompatActivity {

    abstract boolean isDriver();

    public void sendDriverInfo(View view) {
        EditText nameField = (EditText) findViewById(R.id.textViewDriverName);
        String name = nameField.getText().toString();
        EditText phoneField = (EditText) findViewById(R.id.textViewPhone);
        String phone = phoneField.getText().toString();
        EditText facebookField = (EditText) findViewById(R.id.textViewFacebook);
        String facebook = facebookField.getText().toString();
        EditText fromField = (EditText) findViewById(R.id.textViewFrom);
        String from = fromField.getText().toString();
        EditText destField = (EditText) findViewById(R.id.textViewDestination);
        String dest = destField.getText().toString();
        EditText minLeaveField = (EditText) findViewById(R.id.textViewMinLeaveTime);
        String minLeave = minLeaveField.getText().toString();
        EditText maxLeaveField = (EditText) findViewById(R.id.textViewMaxLeaveTime);
        String maxLeave = maxLeaveField.getText().toString();
        EditText commentsField = (EditText) findViewById(R.id.textViewComment);
        String comments = commentsField.getText().toString();
        boolean isDriver = isDriver();
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//
//        Map<String, Object> childUpdates = new HashMap<>();
//
//        childUpdates.put("db/drivers/phone", phone);
//        childUpdates.put("db/drivers/phone/comments", commentsField);

    }

    void write_new_user(String phone, String name, String facebook, String start_address,
                        String arrival_address, String leave_time_min, String leave_time_max) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("riders/0544311300");
        if(isDriver()) {
//            myRef.child("passengers").get;
        }
        else {

        }
    }
}
