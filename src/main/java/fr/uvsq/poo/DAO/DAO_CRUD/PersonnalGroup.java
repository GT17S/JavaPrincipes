package fr.uvsq.poo.DAO.DAO_CRUD;


import java.util.ArrayList;
import java.util.List;

/**
 * La classe <code>PersonnalGroup</code> représente la classe de d'un groupe de Personnel de travail.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class PersonnalGroup extends PersonnalType{

    private static final long serialVersionUID = 1L;
    private String identifier;
    private final List<PersonnalType> personnelList;

    public PersonnalGroup()
    {
        personnelList = new ArrayList<PersonnalType>();
    }

    public PersonnalGroup(String id)
    {
        personnelList = new ArrayList<PersonnalType>();
        this.identifier = id;
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

    public String getId() {
        return identifier.toString();
    }

    @Override
    public boolean isGroup() {
        return true;
    }

    @Override
    public String toString() {
        return "PersonnalGroup [personnalList=" + personnelList + ", id=" + identifier + "]";
    }

}