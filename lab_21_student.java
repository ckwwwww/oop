package labexam;
import java.util.*;

class Student{
    public String name;
    public int grade;
    List<String> courses;

    public Student(String name,int grade){
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

    public List<String> getCourses(){
        return courses;
    }
    
    public void add(String c){
        courses.add(c);
    }

    public void remove(String c){
        courses.remove(c);
    }

}

public class lab_21_student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();

        System.out.println("Enter grades");
        int grade = sc.nextInt();

        System.out.println("How many courses u want to enter");
        int n = sc.nextInt();
        sc.nextLine();

        Student stud = new Student(name, grade);

        System.out.println("Enter courses name");
        for(int i=0;i<n;i++){
            stud.add(sc.nextLine());
        }

        System.out.println("Student Name: " + stud.getName());
        System.out.println("Grade: " + stud.getGrade());
        System.out.println("Courses: " + stud.getCourses());

        System.out.println("Which course u want to remove");
        stud.remove(sc.nextLine());

        System.out.println("Updated courses: "+stud.getCourses());

    }
}
