package be.kdg.apps.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextAnalyser implements App {
    public void run(){
        //TODO: toon geef een zin, lees de zin in
        System.out.print("Geef een zin: ");
        Scanner scanner= new Scanner(System.in);
        String tekst = scanner.nextLine();

        Map<Character, Integer> letterFrequentie = new HashMap<>();
        for (char letter: tekst.toCharArray()){
            //TODO: check of het zel een letter is (geen leestekens ofzo)
            if (Character.isAlphabetic(letter)) {//Of Character.isLetter(letter)
                //TODO verhoog de teller die bij die letter hoort in de map
                if (letterFrequentie.keySet().contains(letter)) {
                    letterFrequentie.put(letter, letterFrequentie.get(letter) + 1);
                } else {
                    letterFrequentie.put(letter,1);
                }
            }
        }
        //TODO print de map af

        for (Character letter : letterFrequentie.keySet()){
            System.out.println(letter +": " + letterFrequentie.get(letter));
        }



    }

    @Override
    public String getName() {
        return "Text Analyser";
    }
}
