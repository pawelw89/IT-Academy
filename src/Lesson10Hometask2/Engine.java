package Lesson10Hometask2;

import java.util.Objects;

public class Engine implements Cloneable{

    String name;
    int power;

    Engine (String name, int power) {
        this.name = name;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power &&
                Objects.equals(name, engine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
