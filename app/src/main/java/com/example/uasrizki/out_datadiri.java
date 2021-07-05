package com.example.uasrizki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class out_datadiri extends AppCompatActivity {
    TextView nama,tanggal,tempat,g_darah;
    String nama_out,tgl_out,tempat_out,out_darah;
    ImageButton home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_datadiri);

        nama = findViewById(R.id.out_nama);
        tanggal = findViewById(R.id.out_tgl);
        tempat = findViewById(R.id.out_tmpt);
        g_darah = findViewById(R.id.out_darah);

        Intent intent = getIntent();

        nama_out = intent.getStringExtra("NAMA");
        tgl_out = intent.getStringExtra("TGL");
        tempat_out = intent.getStringExtra("TMPT");
        out_darah = intent.getStringExtra("DARAH");

        nama.setText("Nama Lengkap = " + nama_out);
        tanggal.setText("Tanggal Lahir = " + tgl_out);
        tempat.setText("Tempat Lahir = " + tempat_out);
        g_darah.setText("Golongan Darah = " + out_darah);

        home = findViewById(R.id.btn_homeDiri);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(out_datadiri.this, content1.class));
            }
        });

    }
}