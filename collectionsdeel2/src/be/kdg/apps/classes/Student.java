package be.kdg.apps.classes;

import java.util.Objects;

public class Student {
    private String name;
    private int number;
    private int age;

    public Student(String name, int number, int age){
        this.name=name;
        this.number=number;
        this.age=age;
    }

    //equals en hashcode methode maken


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return number == student.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString(){
        return name + " (" + number+")" + " , leeftijd " + age;
    }
}
