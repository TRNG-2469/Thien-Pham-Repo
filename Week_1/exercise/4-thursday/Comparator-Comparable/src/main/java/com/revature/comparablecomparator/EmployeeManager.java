package com.revature.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeManager {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Jon", 10_000);
        Employee e2 = new Employee(2, "Surya", 11_000);
        Employee e3 = new Employee(3, "Chris", 20_000);
        Employee e4 = new Employee(4, "Hamza", 30_000);
        Employee e5 = new Employee(5, "Veeksha", 40_000);

        List<Employee> employees = new ArrayList<>();
        employees.add(e3);
        employees.add(e1);
        employees.add(e5);
        employees.add(e2);
        employees.add(e4);

        System.out.println("Original list:");
        printEmployees(employees);

        // Comparable: uses Employee.compareTo(), so employees are sorted by id.
        Collections.sort(employees);
        System.out.println("\nComparable (default order by id):");
        printEmployees(employees);

        // Comparator: supplies a different order without changing Employee.compareTo().
        Comparator<Employee> byName = Comparator.comparing(Employee::getName);
        employees.sort(byName);
        System.out.println("\nComparator (order by name):");
        printEmployees(employees);

        Comparator<Employee> bySalaryDescending =
                Comparator.comparingInt(Employee::getSalary).reversed();
        employees.sort(bySalaryDescending);
        System.out.println("\nComparator (order by salary, highest first):");
        printEmployees(employees);
    }

    private static void printEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
