package com.example.ads_2018_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LucasSoares extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucas_soares);

        Button btnLucas = findViewById(R.id.button);
        btnLucas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(abrirMain);
//
            }
        });
    }
}
