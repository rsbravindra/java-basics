package com.learnig.basics.java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(21, "Ravi", 23));
        employeeList.add(new Employee(12, "Raj", 22));
        employeeList.add(new Employee(23, "Adi", 28));
        employeeList.add(new Employee(24, "Ravi", 22));
        employeeList.add(new Employee(15, "Raj", 29));
        employeeList.add(new Employee(16, "Adi",30));

        List<Employee> sameAgeEmpList = new LinkedList<>();

        //filter out an employee whose name starts with R
//        employeeList = employeeList.stream().filter(e->e.getName().startsWith("R")).collect(Collectors.toList());
//        System.out.println(employeeList);

        // map a employee whose name starts with R with their age
        Map<Integer, String> empMap = employeeList.stream().
                filter(e -> e.getName().startsWith("R"))
                .collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println(empMap);
        System.out.println(empMap.keySet());
        System.out.println(empMap.values());


        //group employee by age
        Map<Integer, List<Employee>> empByAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(empByAge);

        //sort employee by age and map with their id
        Map<Integer, String> empMapByAge = employeeList.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println(empMapByAge);

        //sort employee by age


    }
}

class Employee {
    private Integer id;
    private String name;
    private Integer age;
    Employee(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id :="+id +" Name :="+name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
