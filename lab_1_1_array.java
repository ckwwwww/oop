package labexam;

import java.util.*;

public class lab_1_1_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int c=0;
        for(int i=0; i<n-1;i++){
            if(arr[i]==arr[i+1]){
                c++;
            }
        }
        System.out.println("c="+c);

        int arr2[] = new int[n-c];
        arr2[0]=arr[0];
        int j=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr2[j]=arr[i];
                j++;
            }
        }
        System.out.println();
        for(int i=0; i<n-c;i++){
            System.out.println(arr2[i]);
        }
    }
}
