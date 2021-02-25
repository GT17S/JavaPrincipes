package fr.uvsq.poo.SOLID.LSP;
/**
 * L'interface  <code>Robot</code> représente un robot sur un terrain.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class Robot {
    private Direction direction;
    private Position position;

    Robot(Position position1,String direction1)
    {
        position= new Position(position1.getX(),position1.getY());
        direction= new Direction(direction1);
    }

    public Position getPOS(){return this.position;}
    public Direction getDIR(){return this.direction;}

}