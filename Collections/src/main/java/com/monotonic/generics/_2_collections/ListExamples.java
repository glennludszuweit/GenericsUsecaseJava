package com.monotonic.generics._2_collections;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        Person donDraper = new Person(1, "Don Draper", 89);
        Person peggyOlson = new Person(2, "Peggy Olson", 65);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(new Person(3,"Bert Cooper", 100));

        madMen.forEach(man -> System.out.println(man.getName() + " " + man.getAge()));
    }
}
