package fr.uvsq.poo.SOLID.SRP;

/**
 * La classe <code>Employe</code> représente un employe.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class Employe {
    private String nom;
    private String adresse;

    @Override
    public String toString() {
        return nom + " - " + adresse;
    }

}