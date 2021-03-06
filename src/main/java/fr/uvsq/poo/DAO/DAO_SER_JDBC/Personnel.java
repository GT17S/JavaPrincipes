package fr.uvsq.poo.DAO.DAO_SER_JDBC;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


/**
 * La classe <code>Personnel</code> représente la classe de Personnel de travail.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class Personnel extends PersonnalType {
    
    private final String nom;
    private final String prenom;
    private  String fonction;
    private final LocalDate dateNaisssance;
    private final List<NumeroTelephone> numerosTelephone;


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getFonction() {
        return this.fonction;
    }

    public LocalDate getDateNaisssance() {
        return dateNaisssance;
    }

    public List<NumeroTelephone> getNumerosTelephone() {
        return numerosTelephone;
    }

    void setFonction(String str){this.fonction=str;}

    @Override
    public boolean isGroup() {
        return false;
    }

    public static class PersonnalBuilder {

        // Required parameters
        private final String nom;
        private final String prenom;
        private final String fonction;

        // Optionnal parameters
        private LocalDate dateNaissance = null;
        private List<NumeroTelephone> numerosTelephone = new ArrayList<NumeroTelephone>();

        public PersonnalBuilder(String Anom, String APrenom,String Afonction)
        {
            this.nom=Anom;
            this.prenom=APrenom;
            this.fonction=Afonction;
        }

        public PersonnalBuilder dateNaissance(LocalDate localDate)
        {
            dateNaissance=localDate;
            return this;
        }

        public PersonnalBuilder addNumeroTelephone(NumeroTelephone numeroTelephone) {
            this.numerosTelephone.add(numeroTelephone);
            return this;
        }

        public Personnel build() {
            return new Personnel(this);
        }
    }

    public Personnel(PersonnalBuilder personnalBuilder) {

        this.nom=personnalBuilder.nom;
        this.prenom=personnalBuilder.prenom;
        this.fonction=personnalBuilder.fonction;
        this.dateNaisssance=personnalBuilder.dateNaissance;
        this.numerosTelephone=personnalBuilder.numerosTelephone;
    }

    //affichage d'un personnnel
    public String toString() {
        return nom + " " + prenom + " " + fonction + " ";
    }


}