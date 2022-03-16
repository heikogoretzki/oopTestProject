package oop;

public abstract class GeomatricObject implements GeomObject2D {
    public abstract double getArea();
    public abstract double getPerimeter();
    protected abstract String getName();

    public String toString() {
        return "Ich bin ein " + getName() + " geometrisches Objekt mit dem Umfang " + getPerimeter() + " und der Fläche " + getArea() + "!";
    }
}
