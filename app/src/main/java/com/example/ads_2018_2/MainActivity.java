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

        Button btnSerufo = findViewById(R.id.btnSerufo);
        btnSerufo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Serufo.class);
                startActivity(intent);
            }
        });

        //[Victor] Fim do código do Victor

        //[Victor] Codigo para mudar para pagina do Victor

        Button btnVictorVieira = findViewById(R.id.btnVictorVieira);
        btnVictorVieira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, atvvictor2.class);
                startActivity(intent);
            }
        });

        //[SERUFO] Fim do código do SERUFO

        Button btnDiogo = findViewById(R.id.btnDiogo);
        btnDiogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, diogoActivity.class);
                startActivity(intent);
            }
        });


        //[Marcos] Meu código
        Button btnMarcos = findViewById(R.id.btnMarcos);
        btnMarcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Marcos.class);
                startActivity(intent);
            }
        });



    }
}
