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
    }

    public void goTojugar(){
        Intent intentMenu = new Intent (this, vs.class);
        startActivity(intentMenu);
    }
}