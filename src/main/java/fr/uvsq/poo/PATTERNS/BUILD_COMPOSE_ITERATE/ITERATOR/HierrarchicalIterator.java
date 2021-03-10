package fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.ITERATOR;

import fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.COMPOSITE.PersonnalGroup;
import fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.COMPOSITE.PersonnalType;

import java.util.Stack;

/**
 * La classe <code>HierrarchicalIterator</code> représente la classe d'iteration hierrarchical de Personnels de travail.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class HierrarchicalIterator extends PersonnalTypeIterator {

    public HierrarchicalIterator(PersonnalGroup personnelGroupe) {
        super(personnelGroupe, new Stack<PersonnalType>());
    }

    @Override
    protected PersonnalType getFromCollection() {
        return ((Stack<PersonnalType>) collection).pop();
    }

}
