package fr.uvsq.poo.DAO.DAO_CRUD;

public  class  DAOFactory{


    public static DAO<Personnel> getPersonnelDAO()
    {
         return new PersonnalDAO();
    }

    public static DAO<PersonnalGroup> getPersonnalGroupDAO()
    {
        return new PersonnalGroupDAO();
    }

}

