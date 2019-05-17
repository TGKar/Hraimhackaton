package com.example.hraimackaton;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class got_ride_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Ride Details");
        setContentView(R.layout.activity_got_ride_activity);

        Button but2 = findViewById(R.id.navigate_button);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url =
                        "https://www.google.com/maps/dir/?api=1&origin=32.1258379%2C+34.7975654&destination=32.1584095%2C+34.9765118&waypoints=31.7792358%2C+35.2233658%7C31.65868%2C+35.144089";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
