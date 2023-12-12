package be.kdg.apps.classes;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateRemover4  implements App {
    //Dit is de versie met een TreeSet
    //Volgorde is verandert -> alfabetisch verandert
    public void run() {
        String woord;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef een aantal woorden, stop met 0");
        Set<String> woorden = new TreeSet<>();

        do {
            woord = scanner.nextLine();
            woorden.add(woord);


        } while (!woord.equals("0"));
        woorden.remove("0");
        System.out.println("STOP");
        System.out.println("De woorden zonder duplicaten :");
        for (String w : woorden) {
            System.out.println(w);
        }

    }

    @Override
    public String getName() {
        return "Duplicate Remover 4";
    }
}
