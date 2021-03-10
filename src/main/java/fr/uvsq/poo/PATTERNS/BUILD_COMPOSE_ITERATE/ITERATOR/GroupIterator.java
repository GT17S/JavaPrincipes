package fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.ITERATOR;

import fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.COMPOSITE.PersonnalGroup;
import fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.COMPOSITE.PersonnalType;

import java.util.ArrayDeque;

/**
 * La classe <code>GroupIterator</code> représente la classe d'iteration par group.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class GroupIterator extends PersonnalTypeIterator {

    public GroupIterator(PersonnalGroup personnalGroup) {
        super(personnalGroup, new ArrayDeque<PersonnalType>());
    }

    @Override
    protected PersonnalType getFromCollection() {
        return ((ArrayDeque<PersonnalType>) collection).remove();
    }

}
