package Lesson10Hometask2;

public class CarTester {

    public static void main(String[] args) throws CloneNotSupportedException {

        Car car1 = new HybridCar("Lexus", "hybrid");
        Car car2 = new FuelCar("Volkswagen", "diesel");
        Car car3 = new FuelCar("Audi", "gasoline");
        Car car4 = new ElectricCar("Tesla", "electric");

        Car[] cars = new Car[4];
        cars[0]=car1;
        cars[1]=car2;
        cars[2]=car3;
        cars[3]=car4;

        for (Car car : cars) {
            System.out.println(car.toString());
            if (car instanceof Tankable) {
                ((Tankable) car).tank();
            }
            else if (car instanceof Chargeable) {
                ((Chargeable) car).charge();
            }
        }

        Car clonnedCar1 = car1.clone();

        System.out.println(car1.getEngine());

        System.out.println(car1.getEngine() == clonnedCar1.getEngine());
    }
}
