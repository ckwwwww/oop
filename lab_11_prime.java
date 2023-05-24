package labexam;
import java.util.*;

public class lab_11_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;

        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }

        if(count>0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
