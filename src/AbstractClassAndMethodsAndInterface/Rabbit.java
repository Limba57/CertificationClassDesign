package AbstractClassAndMethodsAndInterface;

/**
 * @author goran on 15/07/2017.
 */
public class Rabbit extends Animal implements Herbivore, Hop {


    public Rabbit() {
//        super; // does not compile
//        super().setAge(3);

        super();
//        super.setAge(3);
//        this.setAge(3);
//        setAge(3);
    }

    public Rabbit(int age) {
//        this(age); recursive call

//        this();
//        super();
//        this();
//        setAge(3);
        super(3);
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public void printName() {

    }

    @Override
    public void printDetails() {
        System.out.println("Rabbit hop at "+Hop.getHopHeight());
    }
}
