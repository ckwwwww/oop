package labexam;

import java.util.*;
import java.io.*;

public class lab_13_wordcount {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\abhis\\Basic1\\src\\textfile.txt");

            Scanner sc = new Scanner(file);
            int wordCount = 0;

            while (sc.hasNext()) {
                sc.next();
                wordCount++;
            }

            System.out.println(wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

    }
}
