package com.example.uasrizki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class in_datadiri extends AppCompatActivity {
    EditText nama_lengkap,tgl_lahir,tempat_lahir,golongan_darah;
    Button btn_input;
    String nama,tgl,tmpt,darah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_datadiri);
        nama_lengkap = findViewById(R.id.in_nama);
        tgl_lahir = findViewById(R.id.in_tgl_lahir);
        tempat_lahir = findViewById(R.id.in_tempat_lahir);
        golongan_darah = findViewById(R.id.in_darah);

        btn_input = findViewById(R.id.input_data);
        btn_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = nama_lengkap.getText().toString();
                tgl = tgl_lahir.getText().toString();
                tmpt = tempat_lahir.getText().toString();
                darah = golongan_darah.getText().toString();

                Intent intent = new Intent(in_datadiri.this,out_datadiri.class);
                intent.putExtra("NAMA",nama);
                intent.putExtra("TGL",tgl);
                intent.putExtra("TMPT",tmpt);
                intent.putExtra("DARAH",darah);
                startActivity(intent);
            }
        });
    }
}