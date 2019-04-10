package com.example.trivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {

    Button preg1;
    Button preg2;
    Button preg3;
    Button preg4;
    Button sig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preg1= (Button)findViewById(R.id.preg1);
        preg2= (Button)findViewById(R.id.preg2);
        preg3= (Button)findViewById(R.id.preg3);
        preg4= (Button)findViewById(R.id.preg4);
        sig= (Button)findViewById(R.id.sig);




        preg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Primer Pregunta", Toast.LENGTH_SHORT).show();
            }
        });

        preg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Segunda Pregunta", Toast.LENGTH_SHORT).show();
            }
        });

        preg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Tercer Pregunta", Toast.LENGTH_SHORT).show();
            }
        });


        preg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Cuarta Pregunta", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
