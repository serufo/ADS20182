package com.example.ads_2018_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LeandroNeves extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leandro_neves);

        Button btnLeandro = findViewById(R.id.button);
        btnLeandro.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(abrirMain);
//
            }
        });
    }
}
