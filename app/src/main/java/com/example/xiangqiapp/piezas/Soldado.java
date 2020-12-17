package com.example.xiangqiapp.piezas;

public class Soldado extends Pieza{
    public Soldado(boolean c) {
        super(c);
        if(c==true){
            name = "soldadorojo";
        }else{
            name = "soldadoblack";
        }
    }
    @Override
    public void printGhost(int row, int col, Pieza[][] tableroPiezas, boolean color) {

        tableroPiezas[row+2][col+1] = new Ghost(true);

    }
}
