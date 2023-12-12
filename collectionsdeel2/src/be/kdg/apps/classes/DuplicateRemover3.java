package be.kdg.apps.classes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//Dit is de versie met de LinkedHashSet

public class DuplicateRemover3  implements App {
    public void run() {
        String woord;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef een aantal woorden, stop met 0");
        Set<String> woorden = new LinkedHashSet<>();

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
        return "Duplicate Remover 3";
    }

}
