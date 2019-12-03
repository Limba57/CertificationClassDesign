package AbstractClassAndMethodsAndInterface;

public interface Carnivore {
    default void eatMeat() {
        System.out.println("eat meat");
    }
}
