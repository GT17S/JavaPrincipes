package fr.uvsq.poo.SOLID.OCP;
/**
 * La classe <code>Cordonnees</code> représente les cordonnnees d'un employe.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class coordonnees {

    private String nom;
    private String adresse;

    @Override
    public String toString() {
        return nom + " - " + adresse;
    }


}