package com.example.xiangqiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.xiangqiapp.piezas.Caballo;
import com.example.xiangqiapp.piezas.Canon;
import com.example.xiangqiapp.piezas.Carro;
import com.example.xiangqiapp.piezas.Consejero;
import com.example.xiangqiapp.piezas.Pieza;
import com.example.xiangqiapp.piezas.Rey;
import com.example.xiangqiapp.piezas.elefante;

public class chess extends AppCompatActivity {

    ImageView tablero[][] = new ImageView[10][9];

    Pieza tableroPiezas[][] = new Pieza[10][9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chess);

        // Tablero visual
        tablero[0][0] = findViewById(R.id.a1);
        tablero[0][1] = findViewById(R.id.a2);
        tablero[0][2] = findViewById(R.id.a3);
        tablero[0][3] = findViewById(R.id.a4);
        tablero[0][4] = findViewById(R.id.a5);
        tablero[0][5] = findViewById(R.id.a6);
        tablero[0][6] = findViewById(R.id.a7);
        tablero[0][7] = findViewById(R.id.a8);
        tablero[0][8] = findViewById(R.id.a9);

        tablero[1][0] = findViewById(R.id.b1);
        tablero[1][1] = findViewById(R.id.b2);
        tablero[1][2] = findViewById(R.id.b3);
        tablero[1][3] = findViewById(R.id.b4);
        tablero[1][4] = findViewById(R.id.b5);
        tablero[1][5] = findViewById(R.id.b6);
        tablero[1][6] = findViewById(R.id.b7);
        tablero[1][7] = findViewById(R.id.b8);
        tablero[1][8] = findViewById(R.id.b9);

        tablero[2][0] = findViewById(R.id.c1);
        tablero[2][1] = findViewById(R.id.c2);
        tablero[2][2] = findViewById(R.id.c3);
        tablero[2][3] = findViewById(R.id.c4);
        tablero[2][4] = findViewById(R.id.c5);
        tablero[2][5] = findViewById(R.id.c6);
        tablero[2][6] = findViewById(R.id.c7);
        tablero[2][7] = findViewById(R.id.c8);
        tablero[2][8] = findViewById(R.id.c9);

        tablero[3][0] = findViewById(R.id.d1);
        tablero[3][1] = findViewById(R.id.d2);
        tablero[3][2] = findViewById(R.id.d3);
        tablero[3][3] = findViewById(R.id.d4);
        tablero[3][4] = findViewById(R.id.d5);
        tablero[3][5] = findViewById(R.id.d6);
        tablero[3][6] = findViewById(R.id.d7);
        tablero[3][7] = findViewById(R.id.d8);
        tablero[3][8] = findViewById(R.id.d9);

        tablero[4][0] = findViewById(R.id.e1);
        tablero[4][1] = findViewById(R.id.e2);
        tablero[4][2] = findViewById(R.id.e3);
        tablero[4][3] = findViewById(R.id.e4);
        tablero[4][4] = findViewById(R.id.e5);
        tablero[4][5] = findViewById(R.id.e6);
        tablero[4][6] = findViewById(R.id.e7);
        tablero[4][7] = findViewById(R.id.e8);
        tablero[4][8] = findViewById(R.id.e9);

        tablero[5][0] = findViewById(R.id.f1);
        tablero[5][1] = findViewById(R.id.f2);
        tablero[5][2] = findViewById(R.id.f3);
        tablero[5][3] = findViewById(R.id.f4);
        tablero[5][4] = findViewById(R.id.f5);
        tablero[5][5] = findViewById(R.id.f6);
        tablero[5][6] = findViewById(R.id.f7);
        tablero[5][7] = findViewById(R.id.f8);
        tablero[5][8] = findViewById(R.id.f9);

        tablero[6][0] = findViewById(R.id.g1);
        tablero[6][1] = findViewById(R.id.g2);
        tablero[6][2] = findViewById(R.id.g3);
        tablero[6][3] = findViewById(R.id.g4);
        tablero[6][4] = findViewById(R.id.g5);
        tablero[6][5] = findViewById(R.id.g6);
        tablero[6][6] = findViewById(R.id.g7);
        tablero[6][7] = findViewById(R.id.g8);
        tablero[6][8] = findViewById(R.id.g9);

        tablero[7][0] = findViewById(R.id.h1);
        tablero[7][1] = findViewById(R.id.h2);
        tablero[7][2] = findViewById(R.id.h3);
        tablero[7][3] = findViewById(R.id.h4);
        tablero[7][4] = findViewById(R.id.h5);
        tablero[7][5] = findViewById(R.id.h6);
        tablero[7][6] = findViewById(R.id.h7);
        tablero[7][7] = findViewById(R.id.h8);
        tablero[7][8] = findViewById(R.id.h9);

        tablero[8][0] = findViewById(R.id.i1);
        tablero[8][1] = findViewById(R.id.i2);
        tablero[8][2] = findViewById(R.id.i3);
        tablero[8][3] = findViewById(R.id.i4);
        tablero[8][4] = findViewById(R.id.i5);
        tablero[8][5] = findViewById(R.id.i6);
        tablero[8][6] = findViewById(R.id.i7);
        tablero[8][7] = findViewById(R.id.i8);
        tablero[8][8] = findViewById(R.id.i9);

        tablero[9][0] = findViewById(R.id.j1);
        tablero[9][1] = findViewById(R.id.j2);
        tablero[9][2] = findViewById(R.id.j3);
        tablero[9][3] = findViewById(R.id.j4);
        tablero[9][4] = findViewById(R.id.j5);
        tablero[9][5] = findViewById(R.id.j6);
        tablero[9][6] = findViewById(R.id.j7);
        tablero[9][7] = findViewById(R.id.j8);
        tablero[9][8] = findViewById(R.id.j9);

        // Crear tablero inicial
        tableroPiezas[2][1] = new Canon(true);
        tableroPiezas[2][7] = new Canon(true);

        tableroPiezas[0][2] = new elefante(true);
        tableroPiezas[0][6] = new elefante(true);

        tableroPiezas[0][3] = new Consejero(true);
        tableroPiezas[0][5] = new Consejero(true);

        tableroPiezas[0][0] = new Carro(true);
        tableroPiezas[0][8] = new Carro(true);

        tableroPiezas[0][4] = new Rey(true);

        tableroPiezas[3][0] = new Consejero(true);
        tableroPiezas[3][2] = new Consejero(true);
        tableroPiezas[3][4] = new Consejero(true);
        tableroPiezas[3][6] = new Consejero(true);
        tableroPiezas[3][8] = new Consejero(true);

        tableroPiezas[0][1] = new Caballo(true);
        tableroPiezas[0][7] = new Caballo(true);

        tableroPiezas[7][1] = new Canon(false);
        tableroPiezas[7][7] = new Canon(false);

        tableroPiezas[9][2] = new elefante(false);
        tableroPiezas[9][6] = new elefante(false);

        tableroPiezas[9][3] = new Consejero(false);
        tableroPiezas[9][5] = new Consejero(false);

        tableroPiezas[9][0] = new Carro(false);
        tableroPiezas[9][8] = new Carro(false);

        tableroPiezas[9][4] = new Rey(false);

        tableroPiezas[6][0] = new Consejero(false);
        tableroPiezas[6][2] = new Consejero(false);
        tableroPiezas[6][4] = new Consejero(false);
        tableroPiezas[6][6] = new Consejero(false);
        tableroPiezas[6][8] = new Consejero(false);

        tableroPiezas[9][1] = new Caballo(false);
        tableroPiezas[9][7] = new Caballo(false);
        printTaulell();


        /*
        Mover pieza
        tableroPiezas[segundoClick][segundoClick] = tableroPiezas[primerClick][primerClick];
        tableroPiezas[primerClick][primerClick] = null;

         */
    }

    public void printTaulell(){
        for(int i=0; i<10; i++){
            for(int j=0;j<9; j++){
                if(tableroPiezas[i][j]!=null){
                    if(tableroPiezas[i][j].name.equals("G")){
                        tablero[i][j].setBackgroundColor(Color.parseColor("#afae9e"));
                    }else{
                        tablero[i][j].setImageResource(getResources().getIdentifier(tableroPiezas[i][j].name, "drawable", getPackageName()));
                    }

                    Log.i("proves", tableroPiezas[i][j].name + " - " + tableroPiezas[i][j].color);
                }else{
                    // Img transparente o eliminar la imagen inicial...

                }
            }
        }
    }

    public void clickPeca(View v){
        String posPieza = v.getTag().toString();

        int row = Character.getNumericValue(posPieza.charAt(0));
        int col = Character.getNumericValue(posPieza.charAt(1));

        Log.i("proves", tableroPiezas[row][col].name);

        tableroPiezas[row][col].printGhost(row, col, tableroPiezas, tableroPiezas[row][col].color);

        printTaulell();

    }
}