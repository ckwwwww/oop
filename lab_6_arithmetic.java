package labexam;
import java.util.*;

class Arithmetic{
    int add(int n1, int n2){
        int sum = n1+n2;
        return sum;
    }
}

class Adder extends Arithmetic{

}

public class lab_6_arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Adder add1 = new Adder();
        int sum = add1.add(n1,n2);
        System.out.println("My superclass is: Arithmetic");
        System.out.println(sum+" " + n1 + " " + n2);
    }
    

}
