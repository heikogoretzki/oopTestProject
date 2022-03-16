package oop;

public class Square extends Rectangle {
    public Square(double a) {
        super(a, a);
    }

    public double getA() {
        return super.getA();
    }

    @Override
    protected String getName() {
        return "Quadrat";
    }
}
