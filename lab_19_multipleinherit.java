package labexam;
import java.util.*;

interface Account{
    void set();
    void display();
}

interface Person{
    void store();
    void disp();
}

class Customer implements Person, Account{
    String name;
    int accountNumber;
    double balance;

    public void set(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();
        System.out.print("Enter balance: ");
        balance = sc.nextDouble();
    }

    public void display(){
        System.out.println("Account Information:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + (balance * 0.05)); // Assuming 5% interest rate
    }

    public void store(){
        
    }

    public void disp() {
        
    }
}

public class lab_19_multipleinherit {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.set();
        customer.display();
    }
}
