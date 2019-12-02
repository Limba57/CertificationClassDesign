package OverloadingConstructors;

import java.sql.SQLOutput;

class Dog {
    private String name;
    private String breed;
    private double weight;

    public Dog(String name) {
        // this.name = name;
        // breed = "husky";
        // weight = 30.0;

        // System.out.println("construction"); // no compilation: this() must be first line
        this(name, "husky");
        System.out.println("constructor 1");
    }

    public Dog(String name, String breed) {
        // this.name = name;
        // this.breed = breed;
        // weight = 30.0;
        this(name, breed, 30);
        System.out.println("constructor 2");
    }

    public Dog(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        System.out.println("constructor 3");
    }

    public void print() {
        System.out.println("name : " + name + " breed : " + breed + " weight : " + weight);
    }
}

public class OverloadingConstructors {

    public static void main(String[] args) {

        Dog dogOne = new Dog("Jimmy");
        dogOne.print();

        Dog dogTwo = new Dog("Limba", "Labrador");
        dogTwo.print();

        Dog dogThree = new Dog("Tiboune", "cocker", 11);
        dogThree.print();

    }
}
