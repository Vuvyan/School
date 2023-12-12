package be.kdg.apps.demo;

import be.kdg.apps.classes.*;

public class SmartphoneDemo  {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        DuplicateRemover dr = new DuplicateRemover();
        smartphone.installApp(dr);
        DuplicateRemover2 dr2 = new DuplicateRemover2();
        smartphone.installApp(dr2);
        DuplicateRemover3 dr3 = new DuplicateRemover3();
        smartphone.installApp(dr3);
        DuplicateRemover4 dr4 = new DuplicateRemover4();
        smartphone.installApp(dr4);


        Contacten contacten = new Contacten();
        contacten.add("Lissa","0499999999");
        contacten.add("Isis","04999999888");
        contacten.add("Dean","04999977799");
        contacten.add("Mala","04999945639");
        contacten.add("Sang-Mee","0499964249");
        smartphone.installApp(contacten);

        
        TextAnalyser ta = new TextAnalyser();
        smartphone.installApp(ta);
        smartphone.showMenu();
    }

}
