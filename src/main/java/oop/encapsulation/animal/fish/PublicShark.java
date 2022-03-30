package oop.encapsulation.animal.fish;

import oop.encapsulation.animal.PublicAnimal;

public class PublicShark extends PublicAnimal {
    @Override
    public String toString() {
        String result = "";

        result += this.publicName + "\r\n";
        result += this.protectedName + "\r\n";

        this.publicMethod();
        this.protectedMethod();

        return result;
    }
}
