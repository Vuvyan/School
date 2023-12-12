package be.kdg.apps.classes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Hier gebruikt men in plaats van een linkedlist een HashSet
//een nadeel hier is wel dat een hashset uw volgorde niet bijhoudt zoals je het intypt
// als je toch de volgorde wilt bijhouden gebruik je een LinkedHashSet
public class DuplicateRemover2  implements App{
    public void run() {
            String woord;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Geef een aantal woorden, stop met 0");
            Set<String> woorden = new HashSet<>();

            do {
                woord = scanner.nextLine();
                woorden.add(woord); // met hashset worden woorden automatisch geschekt of het er al in zit


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
        return "Duplicate Remover 2";
    }

    }



