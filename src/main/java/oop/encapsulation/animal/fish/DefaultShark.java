package oop.encapsulation.animal.fish;

import oop.encapsulation.animal.PublicAnimal;

class DefaultShark extends PublicAnimal {
    @Override
    public String toString() {
        String result = "";

        result += this.publicName + "\r\n";
        result += this.protectedName + "\r\n";

        return result;
    }
}
