package Lesson14Hometask2;

import java.util.Comparator;

public class CarModelComparator implements Comparator <Car> {
    @Override
    public int compare(Car first, Car second) {
        return first.getModel().compareTo(second.getModel());
    }
}
