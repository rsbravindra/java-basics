package com.learnig.basics.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SortStringStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zasasa", "Alpha", "Gamma");
        List<String> sortedNames = names.stream().sorted().toList();
        System.out.println(sortedNames);


        List<Integer> integerList = Arrays.asList(1,2,43,12,34,22,54,12,55,421);
        System.out.println(integerList);

        List<Integer> sortedIntList = integerList.stream().distinct().sorted().toList();
        System.out.println(sortedIntList);

        List<Student> studentList = Arrays.asList(new Student(123, "Ravi"), new Student(123, "Ravi"), new Student(181, "Anil"),new Student(112, "Puneet"));
        List<Student> uniqueSortedStudents = studentList.stream().distinct().sorted().toList();
        System.out.println(uniqueSortedStudents);
    }
}

class Student {
    Integer studentId;
    String name;

    public Student(Integer studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name "+name+" Id :"+studentId;
    }
}
