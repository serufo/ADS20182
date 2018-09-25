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

        //[Nathanael] Codigo para mudar para pagina do Nathanael

        Button btnNathanael = findViewById(R.id.btnNathanael);
        btnNathanael.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Nathanael.class);
                startActivity(intent);
            }
        });

        //[Nathanael] Fim do código do Nathanael
        //agora sou master


    }
}
