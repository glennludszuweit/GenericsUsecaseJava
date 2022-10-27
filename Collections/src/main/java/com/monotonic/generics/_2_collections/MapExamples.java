package com.monotonic.generics._2_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExamples
{
    public static void main(String[] args)
    {
        Person donDraper = new Person(1,"Don Draper", 89);
        Person peggyOlson = new Person(2,"Peggy Olson", 65);
        Person bertCooper = new Person(3,"Bert Cooper", 100);

        Map<Integer, Person> madMen = new HashMap<>();
        madMen.put(donDraper.getId(), donDraper);
        madMen.put(peggyOlson.getId(), peggyOlson);
        madMen.put(bertCooper.getId(), bertCooper);
        madMen.put(donDraper.getId(), donDraper);

        madMen.forEach((id, man) -> System.out.println(id + ". " + man.getName() + " is " + man.getAge() + " years old."));

        madMen.entrySet().forEach(System.out::println);
    }
}
