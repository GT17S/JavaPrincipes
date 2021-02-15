package fr.uvsq.poo.SOLID.OCP;

/**
 * La classe <code>Manager</code> représente un manager.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class Manager extends Employe {
    private int nbSousFifres;

    @Override
    public double calculSalaire() {
        return super.calculSalaire() + nbSousFifres * 100;
    }

}