package collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

class EmployeeQueue{
    public static void main(String[] args) {
        PriorityQueue<Employee> employees = new PriorityQueue<>();
        Employee e1 = new Employee(1,"Rupali",50000.0);
        employees.offer(e1);

    }
}