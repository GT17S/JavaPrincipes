package fr.uvsq.poo.DAO.DAO_SER_JDBC;

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

