package Lesson9Hometask;

public class Bike extends Transport {
    public Bike(String name) {
        super(name);
    }

    @Override
    public void move(int distance) {
        System.out.println(name + " ride for " + distance + " kilometers");
    }
}
