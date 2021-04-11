package com.example.pertemuanketiga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DenganData extends AppCompatActivity {
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dengan_data);

        String minum = getIntent().getStringExtra(tvHasil);
        String banyak = getIntent().getStringExtra(tvHasil);

        String texthasil = "Minuman "+minum+ " sejumlah " +banyak;
        tvHasil.setText(texthasil);
    }
}