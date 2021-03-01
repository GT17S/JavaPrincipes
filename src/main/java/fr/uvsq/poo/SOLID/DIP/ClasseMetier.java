package fr.uvsq.poo.SOLID.DIP;

import java.time.LocalDateTime;

/**
 * La classe <code>ClasseMetier</code> représente la classe de ClasseMetier.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class ClasseMetier {

    public void uneMethodeMetier(LoggerInterface log) {
        log.write(LocalDateTime.now() + "Debut methode métier");
        log.write(LocalDateTime.now() + "Fin methode métier");
    }

}