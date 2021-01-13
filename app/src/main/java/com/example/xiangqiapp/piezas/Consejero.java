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

        if ( color ==true ){
            if (row>=5){
                checkAndPrint(tableroPiezas, row+1, col);

                tableroPiezas[row][col-1] = new Ghost(true);
                tableroPiezas[row][col+1] = new Ghost(true);
            }else{
                tableroPiezas[row+1][col] = new Ghost(true);
            }

        }else{
            if (row<=4){
                tableroPiezas[row-1][col] = new Ghost(true);
                tableroPiezas[row][col-1] = new Ghost(true);
                tableroPiezas[row][col+1] = new Ghost(true);
            }else{
                tableroPiezas[row-1][col] = new Ghost(true);
            }
        }

    }

    public void checkAndPrint(Pieza[][] tableroPiezas, int row, int col){
        if(tableroPiezas[row][col]==null){
            tableroPiezas[row][col] = new Ghost(true);
        }

    }
}
