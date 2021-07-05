package com.example.uasrizki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class in_datakeluarga extends AppCompatActivity {
    EditText namaAyah,pekerjaanAyah,namaIbu,pekerjaanIbu,alamat;
    Button btn_input;
    String n_ayah,p_ayah,n_ibu,p_ibu,alamat_ortu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_datakeluarga);
        namaAyah = findViewById(R.id.in_namaAyah);
        pekerjaanAyah = findViewById(R.id.in_perkerjaanAyah);
        namaIbu = findViewById(R.id.in_namaIbu);
        pekerjaanIbu = findViewById(R.id.in_pekerjaanIbu);
        alamat = findViewById(R.id.in_alamat);

        btn_input = findViewById(R.id.input_dataOrtu);
        btn_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            n_ayah = namaAyah.getText().toString();
            p_ayah = pekerjaanAyah.getText().toString();
            n_ibu = namaIbu.getText().toString();
            p_ibu = pekerjaanIbu.getText().toString();
            alamat_ortu = alamat.getText().toString();

                Intent intent = new Intent(in_datakeluarga.this,out_datakeluarga.class);
                intent.putExtra("NAMAA",n_ayah);
                intent.putExtra("PEKERJAANA",p_ayah);
                intent.putExtra("NAMAI",n_ibu);
                intent.putExtra("PEKERJAANI",p_ibu);
                intent.putExtra("ALAMAT", alamat_ortu);
                startActivity(intent);
            }
        });
    }
}