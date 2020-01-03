package Lesson7Hometask3;

public class Engine {

    protected String name;
    protected int horsepower;
    protected int cacpacity;
    boolean isStarted;

    public Engine(String name, int horsepower, int cacpacity) {
        this.name = name;
        this.horsepower = horsepower;
        this.cacpacity = cacpacity;
        isStarted=false;
    }

    public void startEngine() {
        isStarted = true;
        System.out.println(name + " engine has been started");
    }

    public void stopEngine() {
        isStarted = false;
        System.out.println(name + " engine has been stopped");
    }
    boolean isStarted () {
        return isStarted;
    }
}
