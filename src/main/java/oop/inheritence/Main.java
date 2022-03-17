package oop.inheritence;

public class Main {
    public static void main(String[] args) {

        FuelCarImpl bmw3er = new FuelCarImpl();
        Motorcycle kawasaki = new Motorcycle();

        bmw3er.tyres = 4;
        kawasaki.tyres = 2;

        System.out.println(bmw3er.getClass());
        System.out.println(kawasaki.getClass());

        System.out.println("bmw3er instanceof FuelCar: " + (bmw3er instanceof FuelCarImpl));
        System.out.println("bmw3er instanceof Car: " + (bmw3er instanceof Car));

        System.out.println("kawasaki instanceof Motorcycle " + (kawasaki instanceof Motorcycle));

        Vehicle veh3er = (Vehicle) bmw3er;

        bmw3er.fuel();
        ((FuelCarImpl)veh3er).fuel();

        getInfo(bmw3er);
        doDrive(bmw3er);

    }

    public static void getInfo(Vehicle vehicle) {
        System.out.println("tyres: " + vehicle.tyres);
    }

    public static void doDrive(Car car) {
        car.drive();
    }
}
