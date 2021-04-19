package fr.uvsq.poo.DAO_CRUD;

/**
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class PersonnalDAO extends DAOSerializer<Personnel> {

    public String GetFilename(String id)
    {
        return id + ".personnal";
    }

    public String GetFilename(Personnel object)
    {
        return GetFilename(object.getNom());
    }
}
