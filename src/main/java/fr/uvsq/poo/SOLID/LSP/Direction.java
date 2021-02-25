package fr.uvsq.poo.SOLID.LSP;

/**
 * La classe <code>Direction</code> représente la direction d'un robot sur un terrain.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class Direction {

    private String direct;

    public Direction(){this.direct="";}
    public Direction(String dir){ setDirection(dir);}

    public String getDirection(){return direct;}

    public void setDirection(String direction) {
        switch (direction) {
            case "LEFT":
                this.direct=direction;
                break;
            case "RIGHT":
                this.direct=direction;
                break;
            case "FORWARD":
                this.direct=direction;
                break;
            case "BACKWARD":
                this.direct=direction;
                break;
        }
    }
}