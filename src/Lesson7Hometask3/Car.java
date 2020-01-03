package Lesson7Hometask3;

public class Car  {
     private String name;
     private Engine engine;
     private int fuelTankCapacity;
     double remainingAmountFuel;

    public Car(String name, Engine engine, int fuelTankCapacity) {
        this.name = name;
        this.engine = engine;
        this.fuelTankCapacity = fuelTankCapacity;
        remainingAmountFuel = fuelTankCapacity;
    }

    public void tank() {
        remainingAmountFuel = fuelTankCapacity;
        System.out.println("Car " + name + " has been tanked up");
    }

    public void startEngine() {
        if (engine.isStarted) {
            System.out.println(engine.name + " engine has been started already in " + name);
        }
        else if (!engine.isStarted) {
            System.out.println("Car " + name + " is starting " + engine.name + " engine ");
            engine.isStarted = true;
        }
    }

    void stopEngine() {
        if (!engine.isStarted) {
            System.out.println(engine.name + " engine has been stopped already in " + name);
        }
        else if (engine.isStarted) {
            System.out.println("Car " + name + " is stopping " + engine.name + " engine ");
            engine.isStarted = false;
        }
    }

    void drive(int speed, int distance) {
        int maxSpeed = engine.horsepower * 2;
        double consumption = engine.cacpacity * 0.01 * 0.01 * distance;
        if (!engine.isStarted) {
            System.out.println("Car VW Golf can't be driven cause engine stopped");
        }
        else if (speed <= maxSpeed && remainingAmountFuel == consumption) {
            System.out.println("Car " + name + " has been driven for " + distance + " km with speed " + speed + " km/h. Tank is empty");
            remainingAmountFuel = 0;
        }
        else if (speed <= maxSpeed && remainingAmountFuel < consumption) {
            System.out.println("Car " + name + " can't be driven. There's not enough fuel");
        }
        else if (speed <= maxSpeed && remainingAmountFuel > consumption) {
            remainingAmountFuel = remainingAmountFuel - consumption;
            System.out.println("Car " + name + " has been driven for " + distance + " km with speed " + speed + " km/h. Remaining fuel: " + remainingAmountFuel + " l");
        }
        else if (speed > maxSpeed && remainingAmountFuel < consumption) {
            System.out.println("Car " + name + " can't be driven. Tank is empty or there or there's not enough fuel");
        }
        else if (speed > maxSpeed && remainingAmountFuel > consumption) {
            remainingAmountFuel = remainingAmountFuel - consumption;
            System.out.println("Car " + name + " has been driven for " + distance + " km with speed " + maxSpeed + " km/h. Remaining fuel: " + remainingAmountFuel + " l");
        }
        else if (speed > maxSpeed && consumption == remainingAmountFuel) {
            remainingAmountFuel = 0;
            System.out.println("Car " + name + " has been driven for " + distance + " km with speed " + maxSpeed + " km/h. Tank is empty");
        }
}
}
