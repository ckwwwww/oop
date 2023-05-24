package labexam;
import java.util.*;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception{
    public NameNotValidException(String message){
        super(message);
    }
}

class Student{
    int rollNo;
    String name;
    int age;
    String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException{
        if(age<15 && age>21){
            throw new AgeNotWithinRangeException("Age is not within the valid range (15-21).");
        }
        
        if(!name.matches("^[a-zA-Z\\s]+$")){
            throw new NameNotValidException("Name contains numbers or special symbols.");
        }


        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

}

public class lab_24_student {
    public static void main(String[] args) {
        try{
            Student stud1 = new Student(65,"Abhishek",21,"java");
            System.out.println("Student 1 created successfully.");
            Student stud2 = new Student(2, "Jane123", 20, "Medicine");
            System.out.println("Student 2 created successfully.");
        }
        catch(NameNotValidException e){
            System.out.println(e.getMessage());
        }
        catch(AgeNotWithinRangeException e){
            System.out.println(e.getMessage());
        }
        
    }
}
