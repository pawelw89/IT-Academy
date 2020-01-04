package Lesson14Hometask2;

import java.util.Comparator;

public class CarManufacturerComparator implements Comparator<Car> {
        @Override
        public int compare(Car first, Car second) {
            return first.getManufacturer().compareTo(second.getManufacturer());
        }
}