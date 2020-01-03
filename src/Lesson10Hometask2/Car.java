package Lesson10Hometask2;

import java.util.Objects;

public class Car implements Cloneable{

    String name;
    String engine;

    Car (String name, String engine) {
        this.name = name;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return name + " " + engine;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, engine);
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}
