package com.monotonic.generics._3_classes_and_interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExamples
{

    public static void main(String[] args)
    {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);

        System.out.println(madMen);
//Custom Comparator
//        madMen.sort(new AgeComparator());
//Anonymous Comparator
//        madMen.sort((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
//        madMen.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return Integer.compare(o1.getAge(), o2.getAge());
//            }
//        });
//Preferred  Comparator
        madMen.sort(Comparator.comparingInt(Person::getAge));

        System.out.println(madMen);

//Custom reverve Comparator
//        madMen.sort(new ReverseComparator<>(new AgeComparator()));
//Preferred reverse Comparator
        madMen.sort(Comparator.comparingInt(Person::getAge).reversed());

        System.out.println(madMen);
    }

}
