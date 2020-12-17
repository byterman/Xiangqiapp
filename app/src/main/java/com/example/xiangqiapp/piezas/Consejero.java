package com.example.xiangqiapp.piezas;

public class Consejero extends Pieza{
    public Consejero(boolean c) {
        super(c);
        if(c==true){
            name = "consejerorojo";
        }else{
            name = "consejeroblack";
        }
    }
    @Override
    public void printGhost(int row, int col, Pieza[][] tableroPiezas, boolean color) {

        tableroPiezas[row+2][col+1] = new Ghost(true);

    }

}
