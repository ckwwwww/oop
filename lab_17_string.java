package labexam;
import java.util.*;

public class lab_17_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[10];

        for(int i=0;i<10;i++){
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }

        Arrays.sort(strings);

        System.out.println("Sorted strings:");
        for(int i=0;i<10;i++){
            System.out.println(strings[i]);
        }

        //2
        String cString = strings[0] + strings[1];
        System.out.println("Combined string: " + cString);

        //3
        String s1 = strings[0];
        String rs1 = "";
        for(int i=s1.length()-1;i>=0;i--){
            rs1 = rs1 + s1.charAt(i);
        }
        System.out.println("Reversed string: " + rs1);

    }
}
