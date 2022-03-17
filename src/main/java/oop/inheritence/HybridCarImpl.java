package oop.inheritence;

public class HybridCarImpl extends Car implements HybridCar{

    @Override
    public void charge() {
        System.out.println("charging....");
    };

    @Override
    public void fuel() {
        System.out.println("fuelling...");
    };
}
