package labexam;

public class lab_2_2_string {
    public static void main(String[] args) {
        String s = "umbrella";
        int count=0;

        if(s.contains("e")){
            count++;
        }

        if(count>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
