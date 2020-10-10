package com.codewithmosh;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees; //static means that it belongs to a class as opposed to instance

    public Employee(int baseSalary) {
        this(baseSalary, 0);

    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (getHourlyRate() * extraHours);
    }
    public int calculateWage() {
        return calculateWage(0); //this is method overloading
    }
}

