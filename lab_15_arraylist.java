package labexam;
import java.util.*;

public class lab_15_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(20);
        a.add(30);
        a.add(40);

        System.out.println("iterator Loop:");
        Iterator<Integer> iterator = a.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Advanced For Loop:");
        for(int i:a){
            System.out.println(i);
        }

        System.out.println("For Loop:");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

    }
}
