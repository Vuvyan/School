package be.kdg.apps.classes;

import java.util.*;

public class Contacten {
    Scanner scanner = new Scanner(System.in);
    //private List<String> namen = new ArrayList<>();
    //private List<String> telefoonnummers = new ArrayList<>();
    private Map<String, String> telefoonnummersByName = new HashMap<>();
    public void add(String naam, String telefoonnummer){
       // namen.add(naam);
       // telefoonnummers.add(telefoonnummer);
        telefoonnummersByName.put(naam, telefoonnummer);

    }

    public void run(){
        //TODO: geef een naam -> de nummer van jef is [telefoonnummer] OF Jef zit niet in mijn contacten
        System.out.println("Geef een naam;");
        String naam = scanner.nextLine();
        if (telefoonnummersByName.keySet().contains(naam)) {
            //int index = namen.indexOf(naam);
            //String telefoonnummer = telefoonnummers.get(index);
            String telefoonnummer = telefoonnummersByName.get(naam);
            System.out.println("Nummer van " +naam+ ": " + telefoonnummer);
        } else {
            System.out.println(naam + " zit niet in mijn contacten...");
        }

    }
}
