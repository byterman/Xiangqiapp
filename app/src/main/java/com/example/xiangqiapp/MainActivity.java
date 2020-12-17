package com.example.xiangqiapp;

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


        final Button btn_play = findViewById(R.id.btn_play);
        btn_play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goTojugar();
            }
        });

        final Button btn_info = findViewById(R.id.btn_info);
        btn_info.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToinfo();
            }
        });

        final Button btn_tutorial = findViewById(R.id.btn_tutorial);
        btn_tutorial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goTotutorial();
            }
        });
    }

    public void goTojugar(){
        Intent intentMenu = new Intent (this, vs.class);
        startActivity(intentMenu);
    }

    public void goToinfo(){
        Intent intentMenu = new Intent (this, info.class);
        startActivity(intentMenu);
    }

    public void goTotutorial(){
        Intent intentMenu = new Intent (this, tutorial.class);
        startActivity(intentMenu);
    }
}