package AbstractClassAndMethodsAndInterface.main;

import AbstractClassAndMethodsAndInterface.Animal;
import AbstractClassAndMethodsAndInterface.Cat;
import AbstractClassAndMethodsAndInterface.Husky;
import AbstractClassAndMethodsAndInterface.Rabbit;

public class PolyParameters {

    public static void main(String[] args) {

        Husky husky = new Husky(3);
        husky.setName("limba");
        printDetails(husky);

        Rabbit rabbit = new Rabbit(3);
        rabbit.setName("bunny");
        printDetails(rabbit);

        Cat cat = new Cat(3);
        cat.setName("gros minet");
        printDetails(cat);
    }

//    public static void printDetails(Husky husky) {
//        husky.printDetails();
//    }
//    public static void printDetails(Rabbit rabbit) {
//        rabbit.printDetails();
//    }

    public static void printDetails(Animal animal) {
        animal.printDetails();
    }
}
