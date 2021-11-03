package com.example.call_center;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class Bnpb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bnpb);

        Button btn_call = (Button) findViewById(R.id.btnCall);
        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent li = new Intent(Intent.ACTION_CALL);
                li.setData(Uri.parse("tel:021-29827793"));
                if (ContextCompat.checkSelfPermission(Bnpb.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Bnpb.this
                            ,new String[] {Manifest.permission.CALL_PHONE},1
                    );
                }
                startActivity(li);
            }

        });
    }
}
