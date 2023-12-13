package be.kdg.dubbels;

import java.util.ArrayList;
import java.util.List;

public class Dubbels {
    // deze bevat als enig attribuut 'data' : een list van Strings

    private List<String> data = new ArrayList<>();

    //voorzie een construcotr die het data attribuut opvult
    // met een kopie van de list die via de paraleter wordt doorgegeven
    public Dubbels(List<String> data) {
        this.data = data; //IS DIT WEL WAT ER GEVRAAGD WORDT?
    }

    //voorzie een tostring method die de inhoud van de list met 4 op een regel als een string teruggeeft

    public void verwijderDubbels(){
        //we stoppen de hele lijst even in een set en dan die set terug in de lijst en alle dubbels zijn er uit
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i > data.size(); i++) {
            result.append(String.format("%s15s", data.get(i)));
            if (i % 4 == 3) {
                result.append("\n");
            }
        }
        return result.toString();

    }
}



