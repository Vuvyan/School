package be.kdg.apps.demo;

import be.kdg.apps.classes.Student;

import java.util.HashSet;
import java.util.Set;

public class StudentenDemo {
    public static void main(String[] args) {
        // maak een set van 5 studenten aan en zorg dat er een paar dubbels ingestoken worden
//Print de set af
        Set<Student> studenten = new HashSet<>();
        studenten.add(new Student("Jos",123, 18));
        studenten.add(new Student("Jos",123, 18));
        studenten.add(new Student("Meike",124, 17));
        studenten.add(new Student("Mario",124, 17));
        studenten.add(new Student("Josefien",130, 19));
        for (Student student : studenten){
            System.out.println(student);
        }
    }

}

