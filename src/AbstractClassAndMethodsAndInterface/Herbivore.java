package AbstractClassAndMethodsAndInterface;

public interface Herbivore {
    default void eatPlant() {
        System.out.println("eating plant");
    }


}
