package com.learnig.basics.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(1,2,4,5,6,7,8,9);
        numberList.forEach(System.out::println);

        // convert list into stream
        Stream<Integer> stream = numberList.stream();

        System.out.println("-filtered even list-");
        // filter stream to find only even numbers
        List<Integer> evenList = stream.filter(each -> each % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);

        List<String> names = List.of("Ravi", "Ningu", "Adi", "Raja");
        List<String> upperCaseNames = null;
        upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseNames);

        // flatMap to flattern multiple list into single list
        List<List<String>> listOfList = List.of(List.of("A", "B"), List.of("C", "D"));
        System.out.println(listOfList);
        List<String> flatList = listOfList.stream().flatMap(List::stream).toList();
        System.out.println(flatList);

        // sort the elements based on natural sorting order or customer comparator
        List<Integer> numbers = List.of(5,12,4,2,54,23);
        List<Integer> sortedNumbers = numbers.stream().sorted().toList();
        System.out.println(sortedNumbers);

        // sort elements custom order

        List<Employee> employeeList = List.of(new Employee(1, "Akhil", 23),new Employee(1, "Seena", 32),new Employee(1, "Farook", 28));
        System.out.println(employeeList);

        List<Employee> sortedEmployees = employeeList.stream()
                .sorted((e1,e2) -> {
                    int idCompare = e1.getId() - e2.getId();
                    int ageCompare = e1.getAge()- e2.getAge();
                    return ageCompare - idCompare;
                }
        ).toList();

        System.out.println(sortedEmployees);

        // reduce
        List<Integer> reduceList = List.of(1,2,4,5);
        int mini = reduceList.stream().reduce(0, Integer::min);
        System.out.println(mini);

        int maxi = reduceList.stream().reduce(0, Integer::max);
        System.out.println(maxi);

        int sum = reduceList.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        int compare = reduceList.stream().reduce(0, (b,a)-> a.compareTo(b));
        System.out.println(compare);


    }
}


class Employee {
    Integer id;
    String name;
    Integer age;
    Employee(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name :" + name + "Id :" + id + "Age :"+age;
    }
}