package com.example.call_center;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class Ambulance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);

        Button btn_call = (Button) findViewById(R.id.btnCall);
        btn_call.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent li = new Intent(Intent.ACTION_CALL);
                li.setData(Uri.parse("tel:118"));
                if (ContextCompat.checkSelfPermission(Ambulance.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Ambulance.this
                            ,new String[] {Manifest.permission.CALL_PHONE},1
                    );
                }
                startActivity(li);
            }

        });
    }

}
