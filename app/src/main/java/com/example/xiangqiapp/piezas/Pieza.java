package com.example.xiangqiapp.piezas;

public abstract class Pieza {
    public boolean color;       // true rojo | false negro
    public String name = "";

    public boolean isEatable=false;

    public Pieza(boolean c){
        this.color = c;
    }

    public abstract void printGhost(int row, int col, Pieza[][]tableroPiezas, boolean color);

}
