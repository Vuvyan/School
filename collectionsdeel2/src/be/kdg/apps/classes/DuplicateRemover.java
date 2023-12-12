package be.kdg.apps.classes;

import java.util.*;

//Hier gebruikt men een LinkedList
public class DuplicateRemover  implements App{
    public void run(){
        String woord;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef een aantal woorden, stop met 0");
        List<String> woorden = new LinkedList<>();

        do {
            woord= scanner.nextLine();
            if (!woorden.contains(woord)){
                woorden.add(woord);
            }

        } while (!woord.equals("0"));
        woorden.remove("0");
        System.out.println("STOP");
        System.out.println("De woorden zonder duplicaten :");
        for (String w:woorden){
            System.out.println(w);
        }

    }

    @Override
    public String getName() {
        return "Duplicate Remover";
    }
}
