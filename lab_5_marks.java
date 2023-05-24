package labexam;
import java.util.*;

abstract class Marks{
    abstract double getPercentage();
}

class A extends Marks{
    double p;
    
    public A(int s1, int s2, int s3){
        p = (s1+s2+s3)/3;
    }
    
    double getPercentage(){
        return p;
    }
}

class B extends Marks{
    double p;
    
    public B(int s1, int s2, int s3,int s4){
        p = (s1+s2+s3+s4)/4;
    }
    
    double getPercentage(){
        return p;
    }
}

public class lab_5_marks {
    public static void main(String[] args) {
        
        Marks stud1 = new A(70,80,90);
        double p1 = stud1.getPercentage();
        System.out.println("Percentage of student 1 = "+p1);

        Marks stud2 = new B(70,80,90,99);
        double p2 = stud2.getPercentage();
        System.out.println("Percentage of student 2 = "+p2);
    }
}
