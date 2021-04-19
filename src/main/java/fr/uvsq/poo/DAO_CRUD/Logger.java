package fr.uvsq.poo.DAO_CRUD;

import java.time.LocalDateTime;

/**
 * Class Logger imlementant l'interface Log pour pouvoir afficher le moment ou L'un des opérations CRUD est éffectue
 * et savoir sur l'état des objets des fonction CRud
 * */

public class Logger implements Log {

    public void write(String string) {
        System.out.println(LocalDateTime.now() + ": " + string);
    }

}
