package com.example.gardxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class homescreen extends AppCompatActivity {
    Intent i;
    ImageView donation,programmes,events,joinus,contactus,aboutus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        donation = findViewById(R.id.donate_button_homescreen);
        donation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(homescreen.this,Donation.class);
                startActivity(i);

            }
        });

        programmes = findViewById(R.id.programmes_button_homescreen);
        programmes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(homescreen.this,Programmes.class);
                startActivity(i);
            }
        });

        events = findViewById(R.id.events_button_homescreen);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent( homescreen.this, Events.class);
                startActivity(i);
            }
        });

        joinus = findViewById(R.id.joinus_button_homescreen);
        joinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent( homescreen.this, Join_us.class);
                startActivity(i);
            }
        });


        aboutus = findViewById(R.id.aboutus_button_homescreen);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent (homescreen.this, About_us.class);
                startActivity(i);
            }
        });


        contactus = findViewById(R.id.contactus_button_homescreen);
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(homescreen.this, Contact_us.class);
                startActivity(i);
            }
        });
    }
}
