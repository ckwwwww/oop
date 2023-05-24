package labexam;

import java.util.*;

public class lab_2_1_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s.toLowerCase();
        String[] words = s.split(" ");
        
        int d=0;
        for(int i=0;i<words.length;i++){
            int count=0;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }

            if(count>0 && !words[i].equals("0")){
                System.out.println(words[i]);
                d++;
            }
        }

        System.out.println(d);

    }
}
