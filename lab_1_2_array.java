package labexam;
import java.util.*;

public class lab_1_2_array {

    public static int[] removed(int arr[], int n, int c){
        int arr2[] = new int[n-c];
        arr2[0]=arr[0];
        int j=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr2[j]=arr[i];
                j++;
            }
        }

        return arr2;
    }

    public static int duplicate(int arr[],int n){
        int c=0;
        for(int i=0; i<n-1;i++){
            if(arr[i]==arr[i+1]){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        System.out.println("Write Elements of 1st array");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Write Elements of 2nd array");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int c1 = duplicate(arr1,n1);
        int c2 = duplicate(arr2,n2);

        int arr3[] = removed(arr1,n1,c1);
        int arr4[] = removed(arr2,n2,c2);
        
        System.out.println();
        for(int i=0;i<n1-c1;i++){
            for(int j=0; j<n2-c2;j++){
                if(arr3[i]==arr4[j]){
                    System.out.println(arr3[i]);
                }
            }
        }
    }
}
