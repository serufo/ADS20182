package com.example.ads_2018_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class atvvictor2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atvvictor2);


        Button victorbutton = findViewById(R.id.victorbutton);
        victorbutton.setOnClickListener (new View.OnClickListener() {
                Intent intent = new Intent(MainActivity.this, atvvictor2.class);
                startActivity(intent);

            }
        });


    }
}
