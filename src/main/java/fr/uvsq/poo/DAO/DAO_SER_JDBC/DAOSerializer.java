package fr.uvsq.poo.DAO.DAO_SER_JDBC;
import java.io.Serializable;


public abstract class DAOSerializer <T extends Serializable> extends Serializer<T>
        implements DAO<T> {

    private Logger logger = new Logger();
    public abstract String GetFilename(String id);
    public abstract String GetFilename(T obj);

    @Override
    public T Create(T object) {
        return CreateFile(object, GetFilename(object), logger);
    }

    @Override
    public T Read(String id) {
        return ReadInFile(GetFilename(id), logger);
    }

    @Override
    public T Update(T object) {
        return UpdateTheFile(object, GetFilename(object), logger);
    }

    @Override
    public void Delete(T object) {
        DeleteTheFile(GetFilename(object), logger);
    }
}
