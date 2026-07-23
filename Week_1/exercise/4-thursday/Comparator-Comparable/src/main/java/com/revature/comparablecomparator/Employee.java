package com.revature.comparablecomparator;

public class Employee implements Comparable<Employee> {

    private final int id;
    private final String name;
    private final int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public int getSalary() {

        return salary;
    }

    /**
     * Defines the natural (default) ordering for Employee objects: by id.
     */
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
