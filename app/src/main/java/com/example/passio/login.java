package com.example.passio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
private Button btloginsdt;
private Button btloginfb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btloginsdt = (Button) findViewById(R.id.bt_sdt);
        btloginsdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, login_sdt.class);
                startActivity(intent);
            }
        });

        btloginfb = (Button) findViewById(R.id.bt_fb);
        btloginfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, Home.class);
                startActivity(intent);
            }
        });
    }
}