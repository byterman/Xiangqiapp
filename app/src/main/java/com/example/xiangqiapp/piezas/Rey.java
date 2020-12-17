package com.example.xiangqiapp.piezas;

public class Rey extends Pieza{
    public Rey(boolean c) {
        super(c);
        if(c==true){
            name = "reyrojo";
        }else{
            name = "reyblack";
        }
    }
    @Override
    public void printGhost(int row, int col, Pieza[][] tableroPiezas, boolean color) {

        tableroPiezas[row+2][col+1] = new Ghost(true);

    }
}
