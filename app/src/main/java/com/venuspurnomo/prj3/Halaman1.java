package com.venuspurnomo.prj3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Halaman1 extends AppCompatActivity {


    Button btnPindah;
    EditText edtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);

        btnPindah = (Button) findViewById(R.id.btnPindah);
        edtNama =  (EditText) findViewById(R.id.edtNama);

        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = edtNama.getText().toString();
                Intent i = new Intent(Halaman1.this, Halaman2.class);
                i.putExtra("nama", nama);
                startActivity(i);
                finish();

            }
        });
    }
}