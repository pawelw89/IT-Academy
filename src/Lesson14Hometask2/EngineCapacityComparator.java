package Lesson14Hometask2;

import java.util.Comparator;

public class EngineCapacityComparator implements Comparator<Engine> {

    @Override
    public int compare(Engine first, Engine second) {
        return ((Integer)first.getCapacity()).compareTo((Integer)second.getCapacity());
    }
}
