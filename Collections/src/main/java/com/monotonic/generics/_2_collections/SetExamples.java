package com.monotonic.generics._2_collections;

import java.util.HashSet;
import java.util.Set;

public class SetExamples
{
    public static void main(String[] args)
    {
        Person donDraper = new Person(1, "Don Draper", 89);
        Person peggyOlson = new Person(2,"Peggy Olson", 65);
        Person bertCooper = new Person(3,"Bert Cooper", 100);

        Set<Person> madMen = new HashSet<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);

        madMen.forEach(man -> System.out.println(man.getName()));
    }
}
