package oop.inheritence;

public class Main {
    public static void main(String[] args) {

        FuelCar bmw3er = new FuelCar();
        Motorcycle kawasaki = new Motorcycle();

        System.out.println(bmw3er.getClass());
        System.out.println(kawasaki.getClass());

        System.out.println("bmw3er instanceof FuelCar: " + (bmw3er instanceof FuelCar));
        System.out.println("bmw3er instanceof Car: " + (bmw3er instanceof Car));

        System.out.println("kawasaki instanceof Motorcycle " + (kawasaki instanceof Motorcycle));

        Vehicle veh3er = (Vehicle) bmw3er;

        bmw3er.fuel();

    }
}
