package com.example.ads_2018_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Marcos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcos);

        //Botao voltar
        Button btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                //[SERUFO] Voce esta na activity Marcos e passando como paramentro a Activity Serufo
                Intent intent = new Intent(Serufo.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
