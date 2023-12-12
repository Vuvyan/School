package be.kdg.apps.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Smartphone {
    private Map<String,App> geinstalleerdeApps = new HashMap<>();

    public void installApp(App newApp){
        geinstalleerdeApps.put(newApp.getName(), newApp);
    }

    public void showMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Geinstalleerde apps:");
            //Toon alle keys (= de namen van de apps):
            for (String appname : geinstalleerdeApps.keySet()){
                System.out.println(appname);
            }
            System.out.print("Maak uw keuze: ");
            String keuze = scanner.nextLine();
            if (geinstalleerdeApps.containsKey(keuze)){
                App geselecteerdeApp = geinstalleerdeApps.get(keuze);
                geselecteerdeApp.run();
            }
        }

    }

}
