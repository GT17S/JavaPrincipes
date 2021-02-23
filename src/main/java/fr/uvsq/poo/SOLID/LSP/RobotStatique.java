package fr.uvsq.poo.SOLID.LSP;

/**
 * La classe <code>RobotStatique</code> représente un RobotStatique sur le terrain sous format initial qui ne peut
 * pas changer de direction et de position par la suite des traitements.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class RobotStatique implements Robot {

    public RobotStatique(Position position1,String direction1)
    {
        this.position.setX(position1.getX());
        this.position.setY(position1.getY());

        this.direction.setDirection(direction1);
    }
}