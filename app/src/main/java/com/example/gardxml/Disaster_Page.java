package com.example.gardxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Disaster_Page extends AppCompatActivity {
    Intent i;
    TextView disaster;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disaster__page);
        disaster = findViewById(R.id.textView_2);
        disaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Disaster_Page.this,Events.class);
                startActivity(i);
            }
        });
    }
}