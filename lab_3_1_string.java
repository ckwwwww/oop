package labexam;
import java.util.*;

public class lab_3_1_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";

        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }

        System.out.println(rev);

        if(s.equals(rev)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
