package labexam;

import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}

class Employee extends Person {
    String designation;
    int salary;

    public Employee(String name, int age, String designation, int salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }

    public boolean hasSalaryGreaterThan5000() {
        return salary > 5000;
    }

    public String getName() {
        return name;
    }
}

public class lab_18_inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        System.out.println("Enter data for 5 employees:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.print("Designation: ");
            String designation = sc.nextLine();
            System.out.print("Salary: ");
            int salary = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            employees[i] = new Employee(name, age, designation, salary);
            System.out.println();
        }

        System.out.println("Employees with salary greater than 5000:");
        for (int i = 0; i < 5; i++) {
            if (employees[i].hasSalaryGreaterThan5000()) {
                System.out.println("Name: " + employees[i].getName());
                System.out.println();
            }
        }
    }
}
