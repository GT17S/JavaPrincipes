package fr.uvsq.poo.DAO_CRUD;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public abstract class Serializer<T extends Serializable> {

    // Serializing the Object
    public T WriteInFile(T object, String filename, Log logger)
    {
        try (ObjectOutputStream	outputStream = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(filename))))
        {
            outputStream.writeObject(object);
            logger.write("Object " + object + " created!");
            outputStream.close();
            return object;
        } catch (IOException exception) {
            logger.write(exception.getMessage());
            return null;
        }
    }

    public void DeleteTheFile(String filename, Log logger)
    {
        File file = new File(filename);
        if(file.delete()) logger.write("Object deleted with successs!");
        else logger.write("Suppression is impossible!!!");
    }

    private boolean Exists(String filename)
    {
        File file = new File(filename);
        return file.exists();
    }

    // De-Serializing the Object
    public T ReadInFile(String filename, Logger logger)
    {
        try (ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(filename))))
        {
            T object = (T) in.readObject();//deserialization
            logger.write("Object " + object + " red successfuly!");
            in.close();
            return object;
        } catch (ClassNotFoundException | IOException e) {
            logger.write(e.getMessage());
            return null;
        }
    }

    public T CreateFile(T object, String filename, Log logger) {
        if (Exists(filename)) {
            logger.write("Creation is impossible");
            return null;
        }
        else {
            WriteInFile(object, filename, logger);
            return object;
        }
    }

    public T UpdateTheFile(T object, String filename, Log logger) {
        if (!Exists(filename)) {
            logger.write("Update is impossible");
            return null;
        }
        else {
            DeleteTheFile(filename, logger);
            WriteInFile(object, filename, logger);
            return object;
        }
    }

}
