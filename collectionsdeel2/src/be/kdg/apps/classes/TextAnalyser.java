package be.kdg.apps.classes;

import java.util.Scanner;

public class TextAnalyser {
    public void run(){
        //TODO: toon geef een zin, lees de zin in
        System.out.print("Geef een zin: ");
        Scanner scanner= new Scanner(System.in);
        String tekst = scanner.nextLine();

        // doorloop alle letters van de zin, maak een map, de key is de letter, de value hoe vaak het voorkomt
        // print de map af

        for (char letter: tekst.toCharArray()){

        }



    }
}
