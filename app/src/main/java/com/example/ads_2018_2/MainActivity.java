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




        Button btnSerufo = findViewById(R.id.btnSerufo);
        Button btnJeison = findViewById(R.id.jeison);
        btnJeison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                Intent intent = new Intent(MainActivity.this, ActivityJeison.class);
                startActivity(intent);
            }
        });
        btnSerufo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Serufo.class);
                startActivity(intent);
            }
        });





    }
}
