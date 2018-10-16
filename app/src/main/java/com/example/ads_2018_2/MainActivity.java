package com.example.ads_2018_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //[SERUFO] Codigo para mudar para pagina do SERUFO

        /*Button btnSerufo = findViewById(R.id.btnSerufo);
        btnSerufo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Serufo.class);
                startActivity(intent);
            }
        });*/

        //[SERUFO] Fim do código do SERUFO

        Button btnLeandro = findViewById(R.id.btnLeandro);
        btnLeandro.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirtelaLucas = new Intent(getApplicationContext(), LeandroNeves.class);
                startActivity(abrirtelaLucas);

            }
        });


    }
}
