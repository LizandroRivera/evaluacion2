package com.example.evaluacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle("RH16-I04-001");
        }
    }

    public void onClickCalc(View v){
        Intent intent = new Intent(this, calculadora.class);
        startActivity(intent);
    }

    public void onClickDatos(View v){
        Intent intent = new Intent(this, datos.class);
        startActivity(intent);
    }
}
