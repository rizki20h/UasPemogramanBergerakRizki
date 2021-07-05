package com.example.uasrizki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class content1 extends AppCompatActivity {
    Button data_diri,data_keluarga;
    ImageButton logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content1);
        data_diri = findViewById(R.id.btn_dataDiri);
        data_diri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(content1.this,in_datadiri.class));
            }
        });

        data_keluarga = findViewById(R.id.btn_dataKeluarga);
        data_keluarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(content1.this,in_datakeluarga.class));
            }
        });

        logout = findViewById(R.id.btn_logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(content1.this, MainActivity.class));
            }
        });
    }
}