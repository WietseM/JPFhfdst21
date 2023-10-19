package be.vdab.gastenboek;

import be.vdab.jpfhfdst21.Punt;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class GastenboekManager {

    public void schrijfBestand(Gastenboek bestand){
        try (var stream = new ObjectOutputStream(Files.newOutputStream(Path.of("bestand.ser")))) {
            stream.writeObject(bestand);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public Gastenboek leesBestand(){
        if (Files.exists(Path.of("bestand.ser"))){
            try (var stream = new ObjectInputStream(Files.newInputStream(Path.of("bestand.ser")));) {
                return (Gastenboek) stream.readObject();
            } catch (IOException | ClassNotFoundException ex) {
                System.err.println(ex);
                return null;
            }
        }
        return new Gastenboek();

    }
}
