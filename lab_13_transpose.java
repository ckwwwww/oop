package labexam;
import java.util.*;

public class lab_13_transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int mat[][] = new int[m][n];

        System.out.println("Enter Elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix before transpose : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matrix after transpose : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}
