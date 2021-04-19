package fr.uvsq.poo.DAO.DAO_CRUD;

/**
 * L'interface  <code>DAO<T></></code> représente l'interface de base permettant de donner accées au concept CRUD.
 *
 * @author GT17S GUENANE Toufik (uvsq21807955)
 * @version 2021
 */

public interface DAO<T> {

    /**
     * Interface Dao contenant toutes les fonctions de depart pour arriver au concept CRUD
     * CRUD:
     *  - Create
     *  - Read
     *  - Update
     *  - Delete
     */

    T Create(T object);
    T Read(String id);
    T Update(T object);
    void Delete(T object);

}
