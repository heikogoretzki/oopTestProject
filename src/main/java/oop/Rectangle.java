package oop;

public class Rectangle extends GeomatricObject {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return (2 * a) + (2 * b);
    }

    @Override
    protected String getName() {
        return "Rechteck";
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
