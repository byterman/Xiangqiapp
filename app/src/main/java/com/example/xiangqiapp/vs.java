package com.example.xiangqiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vs);

        final Button btn_play = findViewById(R.id.vs_btn);
        btn_play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goTojugar();
            }
        });
    }

    public void goTojugar(){
        Intent intentMenu = new Intent (this, chess.class);
        startActivity(intentMenu);
    }
}