package oop.inheritence;

public class FuelCarImpl extends Car implements FuelCar{

    @Override
    public void fuel() {
        System.out.println("fuelling...");
    }
}
