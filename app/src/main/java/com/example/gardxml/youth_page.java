package com.example.gardxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class youth_page extends AppCompatActivity {
    Intent i;
    TextView youth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youth_page);
        youth = findViewById(R.id.textView_2);
        youth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(youth_page.this,Events.class);
                startActivity(i);
            }
        });
    }
}
