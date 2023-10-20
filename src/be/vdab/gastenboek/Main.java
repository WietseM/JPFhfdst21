package be.vdab.gastenboek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var leesEnSchrijf = new GastenboekManager();
        var boek = leesEnSchrijf.leesBestand();
        var scanner = new Scanner(System.in);
        toonKeuzes();
        // var loop = true;
        System.out.print("Keuze?: ");
        // while (loop) {
        for (String antwoord; !(antwoord = scanner.next()).equalsIgnoreCase("E"); ) {
            // var antwoord = scanner.next();
            switch (antwoord.toUpperCase()) {
                case "S":
                    boek.addEntry(schrijfEntry());
                    leesEnSchrijf.schrijfBestand(boek);
                    break;
                case "T":
                    System.out.println(boek);
                    ;
                    break;
                /* case "E":
                    loop = false;
                    break; */
                default:
                    System.out.println("Geen geldige keuze, probeer opnieuw.");
                    toonKeuzes();
            }
            System.out.print("Keuze?: ");
        }

    }

    private static void toonKeuzes() {
        System.out.println("Voor een bericht te schrijven, enter S.");
        System.out.println("Voor alle berichten te tonen, enter T.");
        System.out.println("Om het programmma te beeindigen, enter E.");
    }

    private static GastenboekEntry schrijfEntry() {
        var scanner = new Scanner(System.in);
        System.out.print("Naam: ");
        var naam = scanner.nextLine();
        System.out.print("Boodschap: ");
        var boodschap = scanner.nextLine();
        return new GastenboekEntry(naam, boodschap);
    }
}
