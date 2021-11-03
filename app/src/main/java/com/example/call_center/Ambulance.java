package com.example.call_center;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Ambulance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);

        Button btn_call = findViewById(R.id.btnCall);
        btn_call.setOnClickListener(view -> {
            Intent li = new Intent(Intent.ACTION_CALL);
            li.setData(Uri.parse("tel:118"));
            startActivity(li);
        });
    }

}
