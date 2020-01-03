package Lesson10Hometask3;

import java.util.Scanner;

public class LongestAndShortestWord {
    public static void main(String[] args) {

        System.out.println("Wpisz zdanie:");
        Scanner scanner = new Scanner(System.in);

        String zdanie = scanner.nextLine();
        String[] slowa = zdanie.split(" ");

        int shortestLength;
        int shortestLocation;

        shortestLength = (slowa[0]).length();
        shortestLocation = 0;

        for (int i = 1; i < slowa.length; i++) {
            if ((slowa[i]).length() < shortestLength) {
                shortestLength = (slowa[i]).length();
                shortestLocation = i;
            }
        }

        int longestLength;
        int longestLocation;

        longestLength = (slowa[0]).length();
        longestLocation = 0;

        for (int i = 1; i < slowa.length; i++) {
            if ((slowa[i]).length() > longestLength) {
                longestLength = (slowa[i]).length();
                longestLocation = i;
            }
        }

        System.out.println("Najkrótsze słowo to: " + slowa[shortestLocation]);

        System.out.println("Najdłuższe słowo to: " + slowa[longestLocation]);
    }
}
