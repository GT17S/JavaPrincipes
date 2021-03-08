package fr.uvsq.poo.PATTERNS.BUILD_COMPOSE_ITERATE.COMPOSITE;


public abstract class PersonnalType {

    abstract public boolean isGroup();

    public String typeString() {
        return (isGroup() ? "Groupe du personnels" : "un seul Personnel");
    }
}

