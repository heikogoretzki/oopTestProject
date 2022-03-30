package oop.encapsulation.plants;

//public record Tree(String name, double height) {}

// record => unveränderliche Klassen. Informationen können nicht mehr überschrieben werden

import java.util.UUID;

public class Tree {
    private final String name; // durch final unveränderbar - nur 1x zu setzen
    private final double height;

    public Tree(String name, double height) {
        this.name = name;
        this.height = height;
    }

//    public Tree(double height) {
//        this.height = height;
//    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
