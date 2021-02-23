package fr.uvsq.poo.SOLID.LSP;

/**
 * La classe <code>Position</code> représente la position d'un robot sur un terrain.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class Position {

    private int x,y;

    public Position(){}
    public Position(int Posx,int Posy){ this.x=Posx; this.y=Posy;}
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}