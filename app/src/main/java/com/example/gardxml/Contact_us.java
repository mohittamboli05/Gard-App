package com.example.gardxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Contact_us extends AppCompatActivity {

    RelativeLayout relativeLayout;
    TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        textView1=findViewById(R.id.textView_1);
        textView2=findViewById(R.id.textView_2);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri u = Uri.parse("tel:" + "8619460877");
                Intent i = new Intent(Intent.ACTION_DIAL, u);
                startActivity(i);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri u = Uri.parse("tel:" + "9079605410");
                Intent i = new Intent(Intent.ACTION_DIAL, u);
                startActivity(i);
            }
        });

    }
}
