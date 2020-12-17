package com.example.xiangqiapp.piezas;

public class elefante extends Pieza{
    public elefante(boolean c) {
        super(c);
        if(c==true){
            name = "elefanterojo";
        }else{
            name = "elefanteblack";
        }
    }
    @Override
    public void printGhost(int row, int col, Pieza[][] tableroPiezas, boolean color) {

        tableroPiezas[row+2][col+1] = new Ghost(true);

    /*
        createGhost(row+2, col+1, color, taulell);
        createGhost(row+2, col-1, color, taulell);
        createGhost(row-2, col +1, color, taulell);
        createGhost(row-2, col -1, color, taulell);

        createGhost(row+1, col+2, color, taulell);
        createGhost(row-1, col+2, color, taulell);
        createGhost(row+1, col-2, color, taulell);
        createGhost(row-1, col-2, color, taulell);
    }

    if(row>=0 && row<=7 && col>=0 && col<=7){
        if(taulell[row][col]==null){
            taulell[row][col] = new Ghost(color);
        }else{
            if(taulell[row][col].color!=this.color){
                taulell[row][col].isEatable=true;
            }
        }
     */
    }

}
