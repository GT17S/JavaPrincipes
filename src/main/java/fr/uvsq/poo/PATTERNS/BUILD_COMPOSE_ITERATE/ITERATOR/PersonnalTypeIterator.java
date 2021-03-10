package fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.ITERATOR;

import fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.COMPOSITE.PersonnalGroup;
import fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.COMPOSITE.PersonnalType;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class PersonnalTypeIterator implements Iterator<PersonnalType> {

    private PersonnalGroup racine;
    protected Collection<PersonnalType> collection;

    public PersonnalTypeIterator(PersonnalGroup personnalGroup,
                                 Collection<PersonnalType> collection) {
        this.racine = personnalGroup;
        this.collection = collection;
        this.collection.addAll(racine.getAllPersonnel());
    }

    @Override
    public boolean hasNext() {
        return !collection.isEmpty();
    }

    @Override
    public PersonnalType next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        PersonnalType pt = getFromCollection();
        if(pt.isGroup()) {
            collection.addAll(((PersonnalGroup) pt).getAllPersonnel());
        }
        return pt;
    }

    abstract protected PersonnalType getFromCollection();

    public PersonnalType getRacine() {
        return racine;
    }

}
