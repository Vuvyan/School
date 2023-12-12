package be.kdg.opdrachten;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Opdracht1 {
    public static void main(String[] args) {
        String[]girls = {"An", "Bea", "Bea", "Diana",  "Zoë", "Katleen", "Kristin", "Bea", "Kristin", "Gertrude"};
        Set<String> namenSet = new HashSet<>(Arrays.asList(girls));
        //------------------- To String
        System.out.println(namenSet.toString());
        //------------------- For each
        for (String s: namenSet){
            System.out.println(s);
        }
        //------------------- klassieke lus
        // je moet hier een index ingeven
        //gaat niet
        //-------------------Met iterator
        Iterator<String> iterator = namenSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
