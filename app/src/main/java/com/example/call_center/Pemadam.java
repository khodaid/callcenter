package com.example.call_center;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pemadam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemadam);

        Button btn_call = (Button) findViewById(R.id.btnCall);
        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent li = new Intent(Intent.ACTION_CALL);
                li.setData(Uri.parse("tel:113"));
                if (ContextCompat.checkSelfPermission(Pemadam.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Pemadam.this
                            ,new String[] {Manifest.permission.CALL_PHONE},1
                    );
                }
                startActivity(li);
            }

        });
    }
}