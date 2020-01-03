package Lesson9Hometask;

public class Transport {

    protected String name;

    public Transport(String name) {
        this.name = name;
    }

    public void move(int distance) {
        System.out.println(name + " drive for " + distance + " kilometers");
    }
}
