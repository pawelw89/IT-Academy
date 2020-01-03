package Lesson14Hometask2;

import java.util.Objects;

public class Car implements Comparable<Car>{

    Engine engine;
    private String manufacturer;
    private String model;

    public Car(Engine engine, String manufacturer, String model) {
        this.engine = engine;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(engine, car.engine) &&
                Objects.equals(manufacturer, car.manufacturer) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, manufacturer, model);
    }

    @Override
    public String toString() {
        return manufacturer + " " + model + " " + engine;
    }

    @Override
    public int compareTo(Car another) {
        int result = model.compareTo(another.model);
        if (result == 0) {
            return manufacturer.compareTo(another.manufacturer);
        }
        return result;
    }

}
