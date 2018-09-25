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

        //[SERUFO] Fim do código do SERUFO

        //[SERUFO2] Codigo para mudar para pagina do SERUFO2

        Button btnSerufo2 = findViewById(R.id.btnSerufo2);
        btnSerufo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Serufo2.class);
                startActivity(intent);
            }
        });

        //[SERUFO2] Fim do código do SERUFO2


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
