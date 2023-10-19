package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        var afbeeldingen = Path.of("/data/afbeeldingen");
        System.out.println(afbeeldingen.getParent());
        var huidigeDirectory = Path.of("plaatselijk");
        System.out.println(huidigeDirectory.toAbsolutePath());

        System.out.println(Files.exists(Path.of("/data")));

        var data = Path.of("/data");
        System.out.println(Files.isDirectory(data));
        System.out.println(Files.isRegularFile(data));

        try {
            Files.createDirectory(Path.of("/data/teksten"));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            Files.move(Path.of("/data/afbeeldingen"), Path.of("/data/images"));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            Files.delete(Path.of("/data/teksten"));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            System.out.println(Files.size(Path.of("/data/images/duimop.jpg")));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            Files.copy(Path.of("/data/images/duimop.jpg"), Path.of("/data/images/thumbup.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            Files.move(Path.of("/data/images/thumbup.jpg"), Path.of("/data/images/thumb.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try {
            Files.delete(Path.of("/data/images/thumb.jpg"));
        } catch (IOException ex) {
            System.out.println(ex);
        }





    }
}
