package ImmutableClass;

public class Complex {

    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex plus(Complex b) {
        double newReal = real + b.real;
        double newImmaginary = imaginary + b.imaginary;
        return new Complex(newReal, newImmaginary);
    }

    public Complex minus(Complex b) {
        double newReal = real - b.real;
        double newImmaginary = imaginary - b.imaginary;
        return new Complex(newReal, newImmaginary);
    }

    public Complex times(Complex b) {
        double newReal = real * b.real - imaginary * b.imaginary;
        double newImmaginary = real * b.real + imaginary * b.imaginary;
        return new Complex(newReal, newImmaginary);
    }

    public static Complex plus(Complex a, Complex b) {
        // double newReal = a.real + b.real;
        // double newImmaginary = a.imaginary + b.imaginary;
        // return new Complex(newReal, newImmaginary);
        return a.plus(b); // shorter
    }

}
