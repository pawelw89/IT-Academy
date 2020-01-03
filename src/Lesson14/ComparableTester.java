package Lesson14;

import java.time.LocalDate;
import java.util.*;

public class ComparableTester {
    public static void main(String[] args) {
        Person kowalski = new Person("Jan", "Kowalski", LocalDate.of(1978, 1, 1));
        Person nowak = new Person("Janusz", "Nowak", LocalDate.of(1945, 2, 2));
        Person nowak2 = new Person("Piotrek", "Nowak", LocalDate.of(2003, 3, 3));
        Person sereda = new Person("Oleg", "Sereda", LocalDate.of(1989, 4, 4));

        Set<Person> persons = new TreeSet<>();
        persons.add(kowalski);
        persons.add(nowak);
        persons.add(nowak2);
        persons.add(sereda);

        System.out.println(persons);

        PersonBirthdayComparator personBirthdayComparator = new PersonBirthdayComparator();
        Set<Person> personsWithComparator = new TreeSet<>(Comparator.nullsLast(personBirthdayComparator));
        personsWithComparator.add(kowalski);
        personsWithComparator.add(nowak);
        personsWithComparator.add(nowak2);
        personsWithComparator.add(sereda);

        System.out.println(personsWithComparator);

        Queue<Person> goodLoodQueue = new PriorityQueue<>(Comparator.nullsFirst(personBirthdayComparator));
        goodLoodQueue.add(kowalski);
        goodLoodQueue.add(nowak);
        goodLoodQueue.add(nowak2);
        goodLoodQueue.add(sereda);

        System.out.println(goodLoodQueue);
    }
}
