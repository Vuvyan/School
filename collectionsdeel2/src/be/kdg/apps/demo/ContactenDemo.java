package be.kdg.apps.demo;

import be.kdg.apps.classes.Contacten;

public class ContactenDemo {
    public static void main(String[] args) {
        Contacten contacten = new Contacten();
        contacten.add("Lissa","0499999999");
        contacten.add("Isis","04999999888");
        contacten.add("Dean","04999977799");
        contacten.add("Mala","04999945639");
        contacten.add("Sang-Mee","0499964249");
        contacten.run();

    }

}
