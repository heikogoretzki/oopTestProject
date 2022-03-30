package oop.encapsulation.animal;

import java.util.UUID;

public class PublicAnimal {
    private String privateName;
    protected String protectedName;
    public String publicName;
    String defaultName;

    public PublicAnimal() {
        this("Günther " + UUID.randomUUID());

        System.out.println("Hello World");
    }

    private PublicAnimal(String name) {
        this.privateName = name;
        this.protectedName = name;
        this.publicName = name;
        this.defaultName = name;
    }

    @Override
    public String toString() {
        String result = "";

        result += this.privateName + "\r\n";
        result += this.protectedName + "\r\n";
        result += this.publicName + "\r\n";
        result += this.defaultName + "\r\n";

        return result;
    }

    private void privateMethod() {
        System.out.println("private method");
    }

    protected void protectedMethod() {
        System.out.println("protected method");
    }

    public void publicMethod() {
        System.out.println("public method");
    }

    void defaultMethod() {
        System.out.println("default method");
    }
}
