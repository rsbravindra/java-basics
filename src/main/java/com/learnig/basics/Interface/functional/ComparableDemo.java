package com.learnig.basics.Interface.functional;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(12, "asasa"));
        students.add(new Student(33, "sSDbas"));
        students.add(new Student(122, "dsas"));
        students.sort(new SortByRollNumber());
        System.out.println(students);

        Collections.sort(students, new SortByRollNumber());
        System.out.println("Sorted by roll Number");

        students.forEach(System.out::println);
    }
}

class Student {
    int rollNumber;
    String name;

    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' ;
    }
}

class SortByRollNumber implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        int nameCompare = o1.name.compareTo(o2.name);



        return nameCompare;
    }


}