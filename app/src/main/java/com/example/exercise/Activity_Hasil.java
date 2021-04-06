package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity_Hasil extends AppCompatActivity {
    //Mendeklarasikan variabel dengan tipe data TextView
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //menghubungkan variabel txEmail dengan componen TextView pada layout
        txEmail = findViewById(R.id.tvEmail);

        //menghubungkan variabel txPassword dengan componen TextView pada layout
        txPassword = findViewById(R.id.tvPassword);

        //membuat objek bundle dan mengambil data yang dikirimkan dari activity sebelumnya
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "a"
        String email = bundle.getString( "a");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass = bundle.getString("b");

        //menampilkan value dari variabel email kedalam txEmail
        txEmail.setText(email);

        //menampilkan value dari variabel pass kedalam txPassword
        txPassword.setText(pass);
    }
}