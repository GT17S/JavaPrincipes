package fr.uvsq.poo.SOLID.DIP;

/**
 * La classe <code>Logger</code> représente la classe de logging.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class Logger implements LoggerInterface {

    @Override
    public void write(String string){
            System.out.println(string);
    }
}