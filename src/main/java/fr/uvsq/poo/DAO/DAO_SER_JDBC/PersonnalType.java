package fr.uvsq.poo.DAO.DAO_SER_JDBC;

import java.io.Serializable;

public abstract class PersonnalType implements Serializable {

    private static final long serialVersionUID = 1L;
    abstract public boolean isGroup();

    public String typeString() {
        return (isGroup() ? "Groupe du personnels" : "un seul Personnel");
    }
}

