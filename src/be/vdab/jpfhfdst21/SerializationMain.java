package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class SerializationMain {
    public static void main(String[] args) {

        //Serialization
        /*
        try (var stream = new ObjectOutputStream(Files.newOutputStream(Path.of("/data/punt.ser")))) {
            stream.writeObject(new Punt(10, 20));
        } catch (IOException ex) {
            System.out.println(ex);
        }*/

        //Deserialization
        try (var stream = new ObjectInputStream(Files.newInputStream(Path.of("/data/punt.ser")));) {
            var punt = (Punt) stream.readObject();
            System.out.println(punt);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }


    }
}
