//the getMessage() method is a method defined in the Throwable class, which is the base class for all exceptions and errors.
//The caught exception is represented by the variable e, which is an instance of the Exception class (or one of its subclasses).

package labexam;
import java.util.*;

class MyCalculator {
    public long power(int n, int p) throws Exception {

        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 || p == 0) {
            throw new Exception("n or p should not be zero");
        } else {
            long ans = n;

            for (int i = 1; i < p; i++) {
                ans = ans * n;
            }
            return ans;
        }

    }
}

public class lab_7_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        MyCalculator calci = new MyCalculator();
        try {
            long ans = calci.power(n, p);
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
