package Lesson14Hometask2;

import java.util.Objects;

public class Engine implements Comparable<Engine> {

    private int capacity;
    private int horsePower;

    public Engine(int capacity, int horsePower) {
        this.capacity = capacity;
        this.horsePower = horsePower;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return capacity == engine.capacity &&
                horsePower == engine.horsePower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, horsePower);
    }

    @Override
    public String toString() {
        return capacity + " m3 " + horsePower +
                " KM";
    }

    @Override
    public int compareTo(Engine another) {
        int result = ((Integer)horsePower).compareTo((Integer)another.horsePower);
        if (result == 0) {
            return ((Integer)capacity).compareTo((Integer)another.capacity);
        }
        return result;
    }
}
