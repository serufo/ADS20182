package com.example.ads_2018_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class diogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diogo);
        //não vai nem por decreto
        Button btnVoltarDiogo = findViewById(R.id.btnVoltarDiogo);
        btnVoltarDiogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(diogoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
