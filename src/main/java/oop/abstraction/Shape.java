package oop.abstraction;

public abstract class Shape {

    public abstract double getArea();
    protected abstract String getColor();

    @Override
    public String toString() {
        return this.getClass().getName() + " => Farbe: " + this.getColor();
    }
}
