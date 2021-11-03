package com.example.call_center;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button damkar, polisi, basarnas, bnbp, ambulan;

        damkar = (Button)findViewById(R.id.btnDamkar);
        damkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Pemadam.class));
            }
        });
        basarnas = (Button)findViewById(R.id.btnBasarnas);
        basarnas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Basarnas.class));
            }
        });
        ambulan = (Button)findViewById(R.id.btnAmbulan);
        ambulan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Ambulance.class));
            }
        });
        bnbp = (Button)findViewById(R.id.bntBNPB);
        bnbp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Bnpb.class));
            }
        });
        polisi = (Button)findViewById(R.id.btnPolisi);
        polisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Polisi.class));
            }
        });
    }
}