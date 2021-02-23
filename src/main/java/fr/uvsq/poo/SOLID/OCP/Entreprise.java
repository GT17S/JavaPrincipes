package fr.uvsq.poo.SOLID.OCP;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe <code>Entreprise</code>
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class Entreprise {


    private List<Salarie> salarieList;

    public Entreprise() {
        salarieList = new ArrayList<Salarie>();
    }

    public double getSommeTotaleSalaires() {
        double sum = 0;
        for (Salarie s : salarieList) {
            sum += s.calculSalaire();
        }
        return sum;
    }

    public List<Salarie> getSalarieList() {
        return salarieList;
    }
}
