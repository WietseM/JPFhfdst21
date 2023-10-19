package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BinaireBestandenMain {
    public static void main(String[] args) {
        try (var input = Files.newInputStream(Path.of("/data/images/duimop.jpg"));
             var output = Files.newOutputStream(Path.of("/data/images/thumb.jpg"))) {
            for (int eenByte; (eenByte = input.read()) != -1; ) {
                output.write(eenByte);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

        try (var stream = Files.newDirectoryStream(Path.of("/data"))) {
            for (var path : stream) {
                System.out.println(path);
                System.out.println(Files.isDirectory(path) ? ":directory" : ":bestand");
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
