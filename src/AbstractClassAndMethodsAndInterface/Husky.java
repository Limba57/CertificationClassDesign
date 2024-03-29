package AbstractClassAndMethodsAndInterface;

/**
 * @author goran on 14/07/2017.
 */
public class Husky extends Dog {

    public Husky(int age) {
//        this();
        super(age);
        System.out.println("Husky");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Husky eating");

        super.eat();
    }

    @Override
    public int getWeight() {
        return 30;
    }

    @Override
    public void printName() {
        System.out.println("Husky name = "+getName());
    }

    @Override
    public int getTailLenght() {
        return 1;
    }

    @Override
    public void run(int speed) {
        System.out.println("husky run at "+speed);
    }
}
