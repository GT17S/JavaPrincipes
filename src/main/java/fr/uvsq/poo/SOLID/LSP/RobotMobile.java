package fr.uvsq.poo.SOLID.LSP;

/**
 * La classe <code>RobotMobile</code> représente  un robot sur un terrain qui peut se deplacer(qui est mobile et non statique).
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class RobotMobile extends RobotStatique {

    public RobotMobile(Position position1, String direction1) {
        super(position1, direction1);
    }

    public void avance() {}
}
