package com.venuspurnomo.prj3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Halaman2 extends AppCompatActivity {

    TextView txtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        txtNama = (TextView) findViewById(R.id.txtNama);

        Intent i = getIntent();
        String nama = i.getStringExtra("nama");
        txtNama.setText(nama);
    }
}