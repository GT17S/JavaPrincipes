package fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.ITERATOR;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.BUILDER.Personnel;
import fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.COMPOSITE.PersonnalGroup;
import org.junit.Before;
import org.junit.Test;


public class PersonnalTypeITeratorTEST {
    private PersonnalGroup racine;

    @Before()
    public void setUp() {
        racine = new PersonnalGroup();
    }

    @Test()
    public void testGetRacineParGroupe() {
        PersonnalTypeIterator pti = racine.groupIterator();
        assertEquals(pti.getRacine(), racine);
    }

    @Test()
    public void testIsEmptyParGroupe() {
        PersonnalTypeIterator pti = new GroupIterator(racine);
        assertFalse(pti.hasNext());
    }

    @Test()
    public void testPersonnelGroupeParGroupe() {
        PersonnalGroup pg = new PersonnalGroup();
        racine.addPersonnel(pg);
        PersonnalTypeIterator pti = new GroupIterator(racine);
        assertEquals(pti.next(), pg);
    }

    @Test()
    public void testPersonnelParGroupe() {
        Personnel pg = new Personnel.PersonnalBuilder("James", "DANIEL", "Plombier").build();
        racine.addPersonnel(pg);
        PersonnalTypeIterator pti = new GroupIterator(racine);
        assertEquals(pti.next(), pg);
    }

    @Test()
    public void testGetRacineParHierarchie() {
        PersonnalTypeIterator pti = racine.hierrarchicalIterator();
        assertEquals(pti.getRacine(), racine);
    }

    @Test()
    public void testIsEmptyParHierarchie() {
        PersonnalTypeIterator pti = new HierrarchicalIterator(racine);
        assertFalse(pti.hasNext());
    }

    @Test()
    public void testPersonnelGroupeParHierarchie() {
        PersonnalGroup pg = new PersonnalGroup();
        racine.addPersonnel(pg);
        PersonnalTypeIterator pti = new HierrarchicalIterator(racine);
        assertEquals(pti.next(), pg);
    }

    @Test()
    public void testPersonnelParHierarchie() {
        Personnel pg = new Personnel.PersonnalBuilder("Jean", "Jacques", "Plombier").build();
        racine.addPersonnel(pg);
        PersonnalTypeIterator pti = new HierrarchicalIterator(racine);
        assertEquals(pti.next(), pg);
    }

    @Test()
    public void testPersonnelList() {
        PersonnalGroup pg = new PersonnalGroup();
        racine.addPersonnel(pg);
        racine.removePersonnel(pg);
        assertFalse(pg.groupIterator().hasNext());
    }



}
