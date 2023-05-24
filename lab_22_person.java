package labexam;
import java.util.*;

class Person{
    String fName;
    String lName;

    public Person(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public String getFirstName(){
        return fName;
    }

    public String getLastName(){
        return lName;
    }
}

class Employee extends Person{
    int employeeId;
    String jobTitle;

    public Employee(String fName,String lName,int employeeId,String jobTitle){
        super(fName,lName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    @Override
    public String getLastName(){
        return lName + "(" + jobTitle + ")";
    } 
}

public class lab_22_person {
    public static void main(String[] args) {
        Person person = new Person("Abhishek", "Wankhade");
        Employee employee = new Employee("Abhishek", "W", 1345, "Manager");

        System.out.println("Person Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Employee Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
