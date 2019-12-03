package ImmutableClass;

public class ImmutableClass {

    public static void main(String[] args) {

        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);

        //Complex bPlusA = b.plus(a);
        Complex bPlusA = Complex.plus(a, b);

        System.out.println("a real = " + a.getReal() + " immaginary = " + a.getImaginary());
        System.out.println("b real = " + b.getReal() + " immaginary = " + b.getImaginary());
        System.out.println("b + a real = " + bPlusA.getReal() + " immaginary = " + bPlusA.getImaginary());

    }

}
