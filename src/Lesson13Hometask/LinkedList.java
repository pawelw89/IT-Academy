package Lesson13Hometask;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        long endTime = 0;

        List<Integer> intigers = new ArrayList<>();
        for (int i = 0; i < 100_000_000; i++);

        intigers.add  (0,24);
        intigers.get(0);

        endTime = System.currentTimeMillis();

        System.out.println(startTime - endTime);

    }
}
