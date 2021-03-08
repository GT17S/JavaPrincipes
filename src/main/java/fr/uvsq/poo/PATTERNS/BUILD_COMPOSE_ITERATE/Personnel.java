package fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


/**
 * La classe <code>Personnel</code> représente la classe de Personnel de travail.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public class Personnel {

    private final String nom;
    private final String prenom;
    private final String fonction;
    private final LocalDate dateNaisssance;
    private final List<NumeroTelephone> numerosTelephone;


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getFonction() {
        return fonction;
    }

    public LocalDate getDateNaisssance() {
        return dateNaisssance;
    }

    public List<NumeroTelephone> getNumerosTelephone() {
        return numerosTelephone;
    }

    static class PersonnalBuilder {

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
        this.fonction=personnalBuilder.prenom;
        this.dateNaisssance=personnalBuilder.dateNaissance;
        this.numerosTelephone=personnalBuilder.numerosTelephone;
    }


}