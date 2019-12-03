package AbstractClassAndMethodsAndInterface.main;

import AbstractClassAndMethodsAndInterface.*;

public class Polymorphism {

    public static void main(String[] args) {

       Husky husky = new Husky(5);
       husky.setName("Limba");
       husky.eat();
//
       Dog dog = husky; // another reference to husky in the memory
       dog.printDetails();
       dog.eat();
//
       HasTail hasTail = husky;
       System.out.println("tailLenght" + hasTail.getTailLenght());
//
       CanRun canRun = husky;
       canRun.run(56);
//
       Animal animal = husky;
       animal.printDetails();
       animal.eat();

       Animal rabbitAnimal = new Rabbit();
       rabbitAnimal.printDetails();



    }
}
