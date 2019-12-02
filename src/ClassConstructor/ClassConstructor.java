package ClassConstructor;

class Dog {

    private String color;

    public Dog(String color) {
        System.out.println("construct");
        this.color = color;
    }
    // public dog(){} // not same name as class
    public void Dog(){} // compile but not a constructor
                        // because of return type

    public void printColor() {
        System.out.println("It's a "+color+" dog");
    }

}

class Cat {
    private String color;
    private int height;
    private int lenght;

    public Cat(int lenght, int theHeight) {
        this.lenght = lenght;
        height = theHeight;
        color = "white";
    }

    public void printInfo() {
        System.out.println("lenght : " + lenght + " height : " + height + " color : " + color);
    }
}
public class ClassConstructor {

    public static void main(String[] args) {
        Dog dog = new Dog("white");
        dog.printColor();

        Cat cat = new Cat(12, 24);
        cat.printInfo();
    }
}
