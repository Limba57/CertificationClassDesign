package AbstractClassAndMethodsAndInterface.main;


import AbstractClassAndMethodsAndInterface.Bear;
import AbstractClassAndMethodsAndInterface.Cat;
import AbstractClassAndMethodsAndInterface.Husky;
import AbstractClassAndMethodsAndInterface.Rabbit;

/**
 * @author goran on 14/07/2017.
 */
public class Main {

    public static void main(String[] args) {

        Husky husky = new Husky(5);
        husky.setName("Limba");
        husky.printDetails();
        husky.setAge(6);
        husky.printName();
        husky.printDetails();
        husky.run(100);
        System.out.println("husky tail = "+husky.getTailLenght());
        System.out.println("weight "+husky.getWeight());

//        Dog dog = new Dog(3);
//        dog.setName("Rex");
//        dog.printDetails();

        husky.eat();
        System.out.println("avg= " + husky.getAverageWeight());

        Bear bear = new Bear();

        bear.eatMeat();
        bear.eatPlant();
        bear.printDetails();

        Rabbit rabbit = new Rabbit();
        rabbit.eatPlant();
        rabbit.printDetails();

        Cat cat = new Cat(3);
        int speed = cat.getSpeed();
        System.out.println("cat speed = "+speed);



    }
}
