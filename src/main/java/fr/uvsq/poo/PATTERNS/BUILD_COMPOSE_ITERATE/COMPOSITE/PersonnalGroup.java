package fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.COMPOSITE;

import fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.ITERATOR.GroupIterator;
import fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.ITERATOR.HierrarchicalIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * La classe <code>PersonnalGroup</code> représente la classe de d'un groupe de Personnel de travail.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class PersonnalGroup extends PersonnalType implements Iterable<PersonnalType>{

    private final List<PersonnalType> personnelList;

    public PersonnalGroup() {
        personnelList = new ArrayList<PersonnalType>();
    }

    public void addPersonnel(PersonnalType p) {
        personnelList.add(p);
    }

    public void removePersonnel(PersonnalType p) {
        personnelList.remove(p);
    }

    public List<PersonnalType> getAllPersonnel() {
        return personnelList;
    }

    @Override
    public boolean isGroup() {
        return true;
    }

    @Override
    public Iterator<PersonnalType> iterator() {
        return personnelList.listIterator();
    }

    public GroupIterator groupIterator() {
        return new GroupIterator(this);
    }

    public HierrarchicalIterator hierrarchicalIterator() {
        return new HierrarchicalIterator(this);
    }

}