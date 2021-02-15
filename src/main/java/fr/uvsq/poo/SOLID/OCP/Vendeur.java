package fr.uvsq.poo.SOLID.OCP;

/**
 * La classe <code>Vendeur</code> représente un vendeur.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class Vendeur extends Employe{

       private double commission;

        @Override
        public double calculSalaire() {
            return super.calculSalaire() + commission;
        }

    }