package oop.inheritence;

public class ElectricCarImpl extends Car implements ElectricCar {

    @Override
    public void charge() {
        System.out.println("charging...");
    }
}
