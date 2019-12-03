package OverLoadingVSOverWritting;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird();
        Bird parrot = new Eagle();
        Eagle eagle = new Eagle();

        parrot = new Bird();
        parrot.fly();
        //eagle = new Bird();
    }
}
