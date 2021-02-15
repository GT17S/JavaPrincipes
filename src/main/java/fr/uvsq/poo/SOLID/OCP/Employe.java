package fr.uvsq.poo.SOLID.OCP;

/**
 * La classe <code>Employe</code> représente un employe.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class Employe implements Salarie {

    private int nombreAnnees;
    private coordonnees coordonne;


    public String getCoordonnees() {
        return coordonne.toString();
    }

    @Override
    public double calculSalaire() {
        return 1500 + nombreAnnees*20;
    }
}