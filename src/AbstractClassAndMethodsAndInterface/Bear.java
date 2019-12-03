package AbstractClassAndMethodsAndInterface;

import AbstractClassAndMethodsAndInterface.Animal;
import AbstractClassAndMethodsAndInterface.Omnivore;

public class Bear extends Animal implements Omnivore {

    @Override
    public int getWeight() {
        return 1000;
    }

    @Override
    public void printName() {
        System.out.println("Bear");
    }

    @Override
    public void eatMeat() {
        System.out.println("eat meat");
    }

    @Override
    public void eatPlant() {
        System.out.println("eat plant");
    }
}
