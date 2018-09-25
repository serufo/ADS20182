package com.example.ads_2018_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Serufo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serufo);

        //Botao voltar
        Button btnVoltar = findViewById(R.id.btnVoltar);
        Intent intent = new Intent(Serufo.this, MainActivity.class);
        startActivity(intent);
    }
}
