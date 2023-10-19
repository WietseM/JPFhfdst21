package be.vdab.jpfhfdst21;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class TekstMain {
    public static void main(String[] args) {
        /* De volledige tekst van een bestand lezen in het interne geheugen.
        try {
            var regels = Files.readAllLines(Path.of("/data/insecten1.csv"));
            for (var regel : regels) {
                System.out.println(regel);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }*/

        /* De tekst van een bestand in blokken lezen
        try {
            var reader = Files.newBufferedReader(Path.of("/data/insecten1.csv"));
            try {
                // var regel = reader.readLine();
                String regel;
                while ((regel = reader.readLine()) != null) {
                    System.out.println(regel);
                    // regel = reader.readLine();
                }
            } catch (IOException ex) {
                System.out.println(ex);
            } finally {
                reader.close();
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } */

        /* Try with resources
        try (var reader = Files.newBufferedReader(Path.of("/data/insecten1.csv"))) {
            for (String regel; (regel = reader.readLine()) != null; ) {
                System.out.println(regel);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } */

        /* Tekst schrijven naar een bestand
        try (var writer =
        Files.newBufferedWriter(Path.of("/data/naam.txt"))) {
            writer.write("Jean");
        } catch (IOException ex) {
            System.out.println(ex);
        } */

        /* Getallen schrijven
        var scanner = new Scanner(System.in);
        System.out.println("Tik getallen. Tik 0 om te stoppen:");
        try (var writer = new PrintWriter(Files.newBufferedWriter(Path.of("/data/getallen.txt")))) {
            for (int getal; (getal = scanner.nextInt()) != 0; ) {
                writer.println(getal);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } */

        // Getallen lezen
        try (var scanner = new Scanner(Files.newBufferedReader(Path.of("/data/getallen.txt")))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextInt());
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }


    }
}