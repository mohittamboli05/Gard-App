package com.example.gardxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Women_page extends AppCompatActivity {
    Intent i;
    TextView women;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women_page);
        women = findViewById(R.id.textView_2);
        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Women_page.this,Events.class);
                startActivity(i);
            }
        });
    }
}