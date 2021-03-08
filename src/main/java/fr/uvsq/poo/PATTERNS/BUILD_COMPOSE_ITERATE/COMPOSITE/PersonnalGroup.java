package fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.COMPOSITE;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe <code>PersonnalGroup</code> représente la classe de d'un groupe de Personnel de travail.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class PersonnalGroup extends PersonnalType {

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
}