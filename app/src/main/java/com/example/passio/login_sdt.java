package com.example.passio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_sdt extends AppCompatActivity {
private Button bt_back;
private Button bt_tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sdt);

        bt_back=(Button)findViewById(R.id.bt_back);
        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login_sdt.this, login.class);
                startActivity(intent);
            }
        });

        bt_tt=(Button)findViewById(R.id.b_tt);
        bt_tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login_sdt.this, Home.class);
                startActivity(intent);
            }
        });

    }
}