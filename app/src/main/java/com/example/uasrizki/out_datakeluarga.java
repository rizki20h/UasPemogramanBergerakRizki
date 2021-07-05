package com.example.uasrizki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class out_datakeluarga extends AppCompatActivity {
    TextView nama_ayah,pekerjaan_ayah,nama_ibu,pekerjaan_ibu,alamat;
    ImageButton home_ortu;
    String nama_a,pekerjaan_a,nama_i,pekerjaan_i,alamat_o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_datakeluarga);

        nama_ayah = findViewById(R.id.out_namaBapak);
        pekerjaan_ayah = findViewById(R.id.out_pekerjaanAyah);
        nama_ibu = findViewById(R.id.out_namaIbu);
        pekerjaan_ibu = findViewById(R.id.out_pekerjaanIbu);
        alamat = findViewById(R.id.out_alamat);

        Intent intent = getIntent();

        nama_a = intent.getStringExtra("NAMAA");
        pekerjaan_a = intent.getStringExtra("PEKERJAANA");
        nama_i = intent.getStringExtra("NAMAI");
        pekerjaan_i = intent.getStringExtra("PEKERJAANI");
        alamat_o = intent.getStringExtra("ALAMAT");

        nama_ayah.setText("Nama Ayah = " +nama_a);
        pekerjaan_ayah.setText("Pekerjaan Ayah = " +pekerjaan_a);
        nama_ibu.setText("Nama Ibu = " + nama_i);
        pekerjaan_ibu.setText("Pekerjaan Ibu = " + pekerjaan_i);
        alamat.setText("Alamat = " +alamat_o);

        home_ortu = findViewById(R.id.btn_homeOrtu);
        home_ortu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(out_datakeluarga.this,content1.class));
            }
        });
    }
}