package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.company.Gender.FEMALE;
import static com.company.Gender.MALE;

public class Test1 {

    public static void main(String[] args) {

        List<Person> listOfPersons = new ArrayList<>(List.of(
                new Person("Ivan", 19, MALE),
                new Person("Alex", 28, MALE),
                new Person("Olena", 13, FEMALE),
                new Person("Oleg", 67, MALE),
                new Person("Maria", 41, FEMALE)
        ));

        Set<String> filteredPersons = listOfPersons.stream()
                .filter(person -> person.getAge() >= 18 && person.getAge() < 60)
                .collect(
                        HashSet::new,
                        (set, person) -> set.add(person.toString()),
                        HashSet::addAll);
        filteredPersons.forEach(System.out::println);
    }
}
