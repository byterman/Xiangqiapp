package com.example.xiangqiapp.piezas;

public class Caballo extends Pieza{
    public Caballo(boolean c) {
        super(c);
        if(c==true){
            name = "caballorojo";
        }else{
            name = "caballoblack";
        }
    }
    @Override
    public void printGhost(int row, int col, Pieza[][] tableroPiezas, boolean color) {

    }
}
