package OrderOfInitialization;

class Exemple {

    private String name = "dog";
    {
        System.out.println(name);
    }

    private static int COUNT = 0;
    static {
        System.out.println(COUNT);
    }

    {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public Exemple() {
        System.out.println("constructor");
    }
}

class Demo {

    static{
        add(2);
    }

    static void add(int number) {
        System.out.print(number + " ");
    }

    Demo() {
        add(5);
    }

    static {
        add(4);
    }

    static {
        new Demo();
    }

    {
        add(6);
    }



    {
        add(8);
    }
}

public class OrderOfInitialization {



    public static void main(String[] args) {

        // Exemple exemple = new Exemple();
        new Demo();
    }
}
