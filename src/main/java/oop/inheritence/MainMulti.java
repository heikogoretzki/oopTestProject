package oop.inheritence;

import java.util.List;

public class MainMulti {

    public static void main(String[] args) {

        FuelCar bmw3er = new FuelCarImpl();
        ElectricCar tesla = new ElectricCarImpl(); //man geht normalerweise auf die Interface-Klasse zum Erstellen von Objekten.
        HybridCar toyota = new HybridCarImpl();

        bmw3er.fuel();
        tesla.charge();

        toyota.fuel();
        toyota.charge();

        List<ElectricCar> electricCarList = List.of(tesla, toyota);
        List<FuelCar> fuelCars = List.of(bmw3er, toyota);
    }
}
