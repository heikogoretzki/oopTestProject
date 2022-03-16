package oop;

public class RightAngleTriangle extends GeomatricObject {
    private double a;
    private double b;

    public RightAngleTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return (getA() * getB()) / 2;
    }

    @Override
    public double getPerimeter() {
        double c = Math.sqrt((a * a) + (b * b));
        return a + b + c;
    }

    @Override
    protected String getName() {
        return "rechtwinkeliges Dreieck";
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
