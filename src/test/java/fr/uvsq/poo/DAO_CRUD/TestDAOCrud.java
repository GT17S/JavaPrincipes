package fr.uvsq.poo.DAO_CRUD;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Before;
import org.junit.Test;


public class TestDAOCrud {

    private Personnel personne;
    private PersonnalGroup personnalGroup;

    @Before()
    public void setUp() {
        personne = new Personnel.PersonnalBuilder("GUENANE", "Toufik", "DATA SCIENTIST").build();
        personnalGroup = new PersonnalGroup("personnalGroup");

        PersonnalGroup SouspersonnalGroup = new PersonnalGroup("sousPersonnalGroup");
        personnalGroup.addPersonnel(SouspersonnalGroup);
        personnalGroup.addPersonnel(personne);
    }

    @Test()
    public void testSerializationOFPersonnel() {
        Personnel pepeGuardiola = null;
        ObjectOutputStream objectOutputStreamos;
        ObjectInputStream objectInputStream;
        try {
            objectOutputStreamos = new ObjectOutputStream(new FileOutputStream("Guenane.txt"));
            objectInputStream = new ObjectInputStream(new FileInputStream("Guenane.txt"));

            try {
                objectOutputStreamos.writeObject(personne);
                pepeGuardiola = (Personnel) objectInputStream.readObject();
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            } finally {
                objectInputStream.close();
                objectOutputStreamos.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(personne.getNom(), pepeGuardiola.getNom());
    }

    @Test()
    public void testSerializationOfPersonnalGroup() {
        PersonnalGroup pg = null;
        ObjectOutputStream output;
        ObjectInputStream inputStream;
        try {
            output = new ObjectOutputStream(new FileOutputStream("GUENANE.txt"));
            inputStream = new ObjectInputStream(new FileInputStream("GUENANE.txt"));

            try {
                output.writeObject(pg);
                personnalGroup = (PersonnalGroup) inputStream.readObject();
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            } finally {
                output.close();
                inputStream.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(pg, personnalGroup);
    }

    @Test()
    public void testPersonnalCRUDoperations() {
        DAO<Personnel> PDAO = DAOFactory.getPersonnelDAO();

        PDAO.Delete(personne);
        PDAO.Create(personne);
        personne.setFonction("Footballer");
        PDAO.Update(personne);

        assertEquals(personne.getNom(), PDAO.Read(personne.getNom()).getNom());
    }

    @Test()
    public void testPersonnalGroupCRUDOperations() {
        DAO<PersonnalGroup> CDAO = DAOFactory.getPersonnalGroupDAO();

        CDAO.Delete(personnalGroup);
        CDAO.Create(personnalGroup);
        personnalGroup.addPersonnel(personne);
        CDAO.Update(personnalGroup);
        assertEquals(personnalGroup.getId(), CDAO.Read(personnalGroup.getId()).getId());
    }






}

