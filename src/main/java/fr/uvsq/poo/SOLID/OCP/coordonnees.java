package fr.uvsq.poo.SOLID.OCP;
/**
 * La classe <code>Cordonnees</code> représente les cordonnnees d'un employe.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class coordonnees {

    public  coordonnees(String nom,String adresse)
    {
        this.adresse=nom;
        this.nom=adresse;
    }

    private String nom;
    private String adresse;

    public void setNom(String name){this.nom=name;}
    public void setAdresse(String name){this.adresse=name;}

    @Override
    public String toString() {
        return nom + " - " + adresse;
    }


}