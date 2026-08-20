package Java8;

import java.util.function.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

public class PredicateDemo {
    public static void main(String[] args) {
        // boolean test(T t)
        // Evaluates this predicate on the given argument.
        // Req age>21 years
        Predicate<Integer> ageCheck = age -> age >= 21 ? true : false;
        System.out.println(ageCheck.test(32));
        System.out.println(ageCheck.test(20));
        if (ageCheck.test(44)) {
            System.out.println("Eligivble");
        } else {
            System.out.println("not Eligivble");
        }
        Employee e1 = new Employee(101, "Ujjwal", 50000);
        Employee e2 = new Employee(102, "Rahul", 60000);
        Employee e3 = new Employee(103, "Amit", 45000);
        Employee e4 = new Employee(104, "Priya", 75000);
        Employee e5 = new Employee(105, "Neha", 55000);
        // Employee Object : find out salary > 10000;
    }

}
