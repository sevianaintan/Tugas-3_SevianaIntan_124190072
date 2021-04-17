package com.example.pertemuanketiga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button buton1,buton2;
    EditText Minum, Banyak;
    private RecyclerView recyclerView;
    private ArrayList<MinumModel> minumModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText mMinum = findViewById(R.id.minum);
        EditText mBanyak = findViewById(R.id.banyak);
        Button buton1 = findViewById(R.id.input);
        Button buton2 = findViewById(R.id.cp);

        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String minum = mMinum.getText().toString();
                String banyak = mBanyak.getText().toString();

                Intent data = new Intent(MainActivity.this,DenganData.class);
                data.putExtra("Minum", minum);
                data.putExtra("Banyak", banyak);
                startActivity(data);
            }
        });
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dial = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:089513848594"));
                startActivity(dial);
            }
        });


        recyclerView = findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        minumModels.addAll(MinumData.getListData());
        showRV();
    }

    private void showRV() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MinumAdapter minumAdapter = new MinumAdapter(this);
        minumAdapter.setMinumModels(minumModels);
        recyclerView.setAdapter(minumAdapter);
    }

}