package com.example.pertemuanketiga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DenganData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dengan_data);

        Intent data = getIntent();
        String minum = getIntent().getStringExtra("Minum");
        String banyak = getIntent().getStringExtra("Banyak");

        TextView mTVdata = findViewById(R.id.TVdata);

        String texthasil = "Minuman "+minum+ " sejumlah " +banyak+ " buah";
        mTVdata.setText(texthasil);

    }
}