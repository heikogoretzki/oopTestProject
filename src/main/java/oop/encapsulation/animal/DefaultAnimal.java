package oop.encapsulation.animal;

class DefaultAnimal {
    @Override
    public String toString() {
        PublicAnimal publicAnimal = new PublicAnimal();

        String result = "";

        result += publicAnimal.publicName + "\r\n";
        result += publicAnimal.defaultName + "\r\n";
        // !!!
        result += publicAnimal.protectedName + "\r\n";

        return result;
    }

    private void testMethod() {
        PublicAnimal publicAnimal = new PublicAnimal();

        publicAnimal.publicMethod();
        publicAnimal.defaultMethod();
        // !!!
        publicAnimal.protectedMethod();
    }
}
