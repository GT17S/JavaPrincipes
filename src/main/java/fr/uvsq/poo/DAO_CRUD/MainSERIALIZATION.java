package fr.uvsq.poo.DAO_CRUD;

import fr.uvsq.poo.DAO_CRUD.Personnel.PersonnalBuilder;

public enum MainSERIALIZATION {
    ENVIRONNEMENT;

    private void run(String[] args) {

        DAO<Personnel> PDAO = DAOFactory.getPersonnelDAO();
        DAO<PersonnalGroup> CDAO = DAOFactory.getPersonnalGroupDAO();

        Personnel Toufik = new Personnel.PersonnalBuilder("GUENANE", "Toufik", "DATA SCIENTIST").build();
        Personnel Zlatan = new Personnel.PersonnalBuilder("IBRAHIMOVIC", "Zlatan", "FOOTBALLER").build();

        PersonnalGroup personnalGroup = new PersonnalGroup("personnalGroup");
        PersonnalGroup souspersonnalgroup = new PersonnalGroup("souspersonnalgroup");
        personnalGroup.addPersonnel(souspersonnalgroup);
        personnalGroup.addPersonnel(Toufik);
        souspersonnalgroup.addPersonnel(Zlatan);

        // Ajout au dao donc une serialization vers fichier
        System.out.println("Creation de PersonnalGroup:");
        CDAO.Create(personnalGroup);

        System.out.println("Creation de SousPersonnalGroup:");
        CDAO.Create(souspersonnalgroup);

        PDAO.Create(Toufik); // update
        PDAO.Create(Zlatan); // update

        //Lecteur de DAO deserialization de fichier
        System.out.println("\t" + CDAO.Read(souspersonnalgroup.getId()));
        System.out.println("\t" + PDAO.Read("GUENANE"));
    }

    public static void main(String[] args)
    {
        ENVIRONNEMENT.run(args);
    }

}
