package ClassInheritance;


public class Main {

    public static void main(String[] args) {

        Husky husky = new Husky(8);
        husky.printDetail();

        Dog dog = new Dog(3);
        dog.setName("Limba");
        dog.printDetail();
    }
}
