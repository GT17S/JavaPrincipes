package fr.uvsq.poo.SOLID.ISP;

/**
 * La classe <code>SuperPrinter</code> représente la classe qui propose l'impression, le faxe, le scanne et copiage des donnnes.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class SuperPrinter implements Printer,Faxer,Scanner,Copier {

    @Override
    public void Print() {

    }

    @Override
    public void Copy() {

    }

    @Override
    public void Fax() {

    }

    @Override
    public void Scan() {

    }
}