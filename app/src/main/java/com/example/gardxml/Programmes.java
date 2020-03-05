package com.example.gardxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Programmes extends AppCompatActivity {
    Intent i;
    ImageView disaster,women,youth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programmes);

        disaster = findViewById(R.id.disaster_button);
        disaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Programmes.this,Disaster_Page.class);
                startActivity(i);

            }

        });

        women = findViewById(R.id.women_button);
        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Programmes.this,Women_page.class);
                startActivity(i);
            }
        });

        youth = findViewById(R.id.youth_button);
        youth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Programmes.this,youth_page.class);
                startActivity(i);
            }
        });

    }
}
