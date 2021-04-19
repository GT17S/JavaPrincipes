package fr.uvsq.poo.DAO.DAO_CRUD;

/**
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class PersonnalGroupDAO extends DAOSerializer<PersonnalGroup>{

    public String GetFilename(String id) {
        return id + ".personnalGroup";
    }

    public String GetFilename(PersonnalGroup object) {
        return GetFilename(object.getId());
    }


}
