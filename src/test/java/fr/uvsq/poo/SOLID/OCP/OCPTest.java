package fr.uvsq.poo.SOLID.OCP;

import org.junit.Before;
import org.junit.Test;


import javax.xml.stream.events.EntityReference;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class OCPTest {
    Vendeur vendone,vendtwo;
    Employe empone,emptwo;
    Manager manager;

    coordonnees ce1,ce2,v1,v2,m;

    Entreprise entreprise;


    @Before
    public void setup() {
        vendone = new Vendeur();
        v1=new coordonnees("ALi","Versailles");

        vendtwo = new Vendeur();
        v2= new coordonnees("Joe","Puteaux");

        empone = new Employe();
        ce1=new coordonnees("Mario","Elancourt");

        emptwo= new Employe();
        ce2= new coordonnees("Zoé","Villepreux");

        entreprise= new Entreprise();
        manager = new Manager();
        m=new coordonnees("Toufik","le chesnay");
    }

    @Test
    public void test() {

        vendone.setEXP(2);
        vendtwo.setEXP(3);
        empone.setEXP(1);
        emptwo.setEXP(0);
        manager.setEXP(5);

        entreprise.getSalarieList().add(vendone);
        entreprise.getSalarieList().add(vendtwo);
        entreprise.getSalarieList().add(empone);
        entreprise.getSalarieList().add(emptwo);
        entreprise.getSalarieList().add(manager);

        System.out.println("le solde total de l'entreprise est de : " + entreprise.getSommeTotaleSalaires());

    }
}