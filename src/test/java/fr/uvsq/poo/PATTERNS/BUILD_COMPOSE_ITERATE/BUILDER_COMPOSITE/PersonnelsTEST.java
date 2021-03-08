package fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.BUILDER_COMPOSITE;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.BUILDER.NumeroTelephone;
import fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.BUILDER.Personnel;

import fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.COMPOSITE.PersonnalGroup;
import org.junit.Before;
import org.junit.Test;


public class PersonnelsTEST {

    private Personnel pers;

    @Before()
    public void setUp() {
        pers = new Personnel.PersonnalBuilder("GUENANE", "Toufik", "DATA SCIENTIST")
                .dateNaissance(LocalDate.parse("1998-01-01", DateTimeFormatter.ISO_DATE))
                .addNumeroTelephone(new NumeroTelephone("Perso", "0555773635"))
                .addNumeroTelephone(new NumeroTelephone("Fax", "0612345678"))
                .build();
    }


    @Test()
    public void testGetNom() {
        assertEquals(pers.getNom(), "GUENANE");
    }

    @Test()
    public void testGetPrenom() {
        assertEquals(pers.getPrenom(), "Toufik");
    }

    @Test()
    public void testGetFonction() {
        assertEquals(pers.getFonction(), "DATA SCIENTIST");
    }

    @Test()
    public void testGetDateNaissance() {
        assertEquals(pers.getDateNaisssance(),
                LocalDate.parse("1998-01-01", DateTimeFormatter.ISO_DATE));
    }

    @Test()
    public void testGetNumerosTelephone() {
        List<NumeroTelephone> numList = new ArrayList<NumeroTelephone>();
        numList.add(new NumeroTelephone("Perso", "0555773635"));
        numList.add(new NumeroTelephone("Fax", "0612345678"));
        assertEquals(pers.getNumerosTelephone(), numList);
    }

    @Test()
    public void testTypeStringPersonnel() {
        assertEquals(pers.typeString(), "un seul Personnel");
    }

    @Test()
    public void testTypeStringGroupe() {
        assertEquals((new PersonnalGroup()).typeString(), "Groupe du personnels");
    }



}
