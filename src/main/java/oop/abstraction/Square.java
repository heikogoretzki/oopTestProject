package oop.abstraction;

public class Square extends Shape implements WithDiagonal {
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    protected String getColor() {
        return "blue";
    }

    @Override
    public double getDiagonalLength() {
        return Math.sqrt(2 * a * a);
    }
}
