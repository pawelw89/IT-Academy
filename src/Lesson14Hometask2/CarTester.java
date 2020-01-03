package Lesson14Hometask2;

import java.util.*;

public class CarTester {
    public static void main(String[] args) {

        Car vw = new Car(new Engine(2000, 120), "Volkswagen", "Passat");
        Car seat = new Car(new Engine(1600, 105), "Seat", "Ibiza");
        Car audi = new Car(new Engine(2200, 160), "Audi", "A5");
        Car skoda = new Car(new Engine(2000, 150), "Skoda", "Octvia");

        List<Car> cars = new ArrayList<Car>();
        cars.add(vw);
        cars.add(seat);
        cars.add(audi);
        cars.add(skoda);

        System.out.println(cars);

        System.out.println("Sortowanie po marce");
        Collections.sort(cars);
        int i = 0;
        for (Car temp : cars) {
            System.out.println("Car " + ++i + " : " + temp.getManufacturer() + ", Manufacturer: " + temp.getManufacturer());
        }

        System.out.println("Sortowanie po modelu");
        Collections.sort(cars);
        int j = 0;
        for (Car temp2 : cars) {
            System.out.println("Car " + ++j + " : " + temp2.getManufacturer() + ", Model: " + temp2.getModel());
        }

        System.out.println("Sortowanie po silniku (pojemność)");
        Collections.sort(cars);
        int k = 0;
        for (Car temp3 : cars) {
            System.out.println("Car " + ++k + " : " + temp3.getManufacturer() + ", Pojemność: " + temp3.engine.getCapacity());
        }
    }
}

