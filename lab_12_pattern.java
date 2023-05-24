package labexam;
import java.util.*;

public class lab_12_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            int stars = 2*i-1;
            for(int j=0; j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-1;i>0;i--){
            int stars = 2*i-1;
            for(int j=0; j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
