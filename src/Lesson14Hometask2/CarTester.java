package Lesson14Hometask2;

import Lesson14.Person;
import Lesson14.PersonBirthdayComparator;

import java.util.*;

public class CarTester {
    public static void main(String[] args) {

        Car vw = new Car(new Engine(2000, 120), "Volkswagen", "Golf");
        Car seat = new Car(new Engine(1600, 105), "Seat", "Ibiza");
        Car audi = new Car(new Engine(2200, 160), "Audi", "Q7");
        Car skoda = new Car(new Engine(2000, 150), "Skoda", "Octvia");

        Set<Car> cars = new TreeSet<>();
        cars.add(vw);
        cars.add(seat);
        cars.add(audi);
        cars.add(skoda);

        System.out.println(cars);

        System.out.println("Sortowanie po marce");

        CarManufacturerComparator carManufacturerComparator = new CarManufacturerComparator();
        Set<Car> carsWithComparator = new TreeSet<>(Comparator.nullsLast(carManufacturerComparator));
        carsWithComparator.add(vw);
        carsWithComparator.add(seat);
        carsWithComparator.add(audi);
        carsWithComparator.add(skoda);

        System.out.println(carsWithComparator);

        System.out.println("Sortowanie po modelu");

        CarModelComparator carModelComparator = new CarModelComparator();
        Set<Car> carsWithComparator2 = new TreeSet<>(Comparator.nullsLast(carModelComparator));
        carsWithComparator2.add(vw);
        carsWithComparator2.add(seat);
        carsWithComparator2.add(audi);
        carsWithComparator2.add(skoda);

        System.out.println(carsWithComparator2);

        System.out.println("Sortowanie po pojemności");

        EngineCapacityComparator engineCapacityComparator = new EngineCapacityComparator();
        Set<Car> engineWithComparator = new TreeSet<>(Comparator.nullsLast(engineCapacityComparator));
        engineWithComparator.add(vw);
        engineWithComparator.add(seat);
        engineWithComparator.add(audi);
        engineWithComparator.add(skoda);

        System.out.println(engineWithComparator);
    }
}