package com.example.xiangqiapp.piezas;

public class Carro  extends Pieza{
    public Carro(boolean c) {
        super(c);
        if(c==true){
            name = "carrodeguerrarojo";
        }else{
            name = "carrodeguerrablack";
        }
    }
    @Override
    public void printGhost(int row, int col, Pieza[][] tableroPiezas, boolean color) {

        tableroPiezas[row+2][col+1] = new Ghost(true);

    }
}
