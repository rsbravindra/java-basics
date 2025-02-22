package com.learnig.basics.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRefPojoDemo2 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(22, "caab"));
        personList.add(new Person(20, "aob"));
        personList.add(new Person(21, "kb"));

        personList.sort(MethodRefPojoDemo2::compareByName);
        personList.forEach(System.out::println);

        System.out.println("-----------");

        personList.sort(MethodRefPojoDemo2::compareByAge);
        personList.forEach(System.out::println);


        Collections.sort(personList, MethodRefPojoDemo2::compareByAge);
        personList.stream()
                .map(person -> person.getName()).forEach(System.out::println);


        Collections.sort(personList, MethodRefPojoDemo2::compareByAge);
        personList.stream().collect(Collectors.toMap(p -> p.getName(), p -> p.getAge())).forEach((k, v) -> System.out.println(k + " == " + v));
    }

    public static int compareByName (Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }

    public static int compareByAge (Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}

class Person {
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name "+ name + " Age " + age;
    }
}

