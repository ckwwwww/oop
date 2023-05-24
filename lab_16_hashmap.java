package labexam;
import java.util.*;

public class lab_16_hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        HashMap<String,Integer> wordCount = new HashMap<>();

        for(int i=0;i<words.length;i++){
            String word = words[i];
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println(wordCount);
    }
}
