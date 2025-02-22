package com.learnig.basics.Interface.functional;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeCustomSortDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(121, "Ravi"));
        list.add(new Employee(23, "Raj"));
        list.add(new Employee(123, "Rajesh"));
        list.add(new Employee(43, "Rakesh"));
        System.out.println("before sort" + list);
//        list.sort(new EmployeeIdComparator());

        list.sort((o1, o2) -> o1.getId() - o2.getId());

        Collections.sort(list, new EmployeeIdComparator());
        System.out.println("after sort" + list);

        list.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new)).forEach(System.out::println);

        list = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list);
        System.out.println(Arrays.toString(list.toArray(Employee[]::new)));


        System.out.println(list.stream().sorted(Comparator.comparing(Employee::getName)).toList());
        List<Employee> sortByNameAndId = list.stream().sorted(Comparator.comparing(Employee::getName).thenComparingInt(Employee::getId).reversed()).toList();
        System.out.println(sortByNameAndId);
    }
}

class Employee implements Comparable{
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
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
        return "Id "+ id + " Name " + name;
    }

    @Override
    public int compareTo(Object o) {
        return o.toString().compareTo(this.toString());
    }
}

class EmployeeIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int idCompare = -(e1.getId() - e2.getId());
        int nameCompare = -(e1.getName().compareTo(e2.getName()));
        return idCompare - nameCompare;
    }
}
