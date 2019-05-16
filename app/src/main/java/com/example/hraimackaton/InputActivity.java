package com.example.hraimackaton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

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
    }
}
