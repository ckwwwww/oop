
package labexam;
import java.util.*;

public class lab_8_phonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of entries in the phone book: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        // Create a HashMap to store the phone book entries
        Map<String, String> phoneBook = new HashMap<>();
        
        // Read the phone book entries
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name: ");
            String name = sc.nextLine();
            System.out.print("Enter the phone number: ");
            String phoneNumber = sc.nextLine();
            phoneBook.put(name, phoneNumber);
        }
        
        System.out.print("Enter the name to search (or type 'exit' to quit): ");
        while (sc.hasNextLine()) {
            String query = sc.nextLine();
            if (query.equals("exit")) {
                break;
            }
            
            String phoneNumber = phoneBook.get(query);
    
            if (phoneNumber != null) {
                System.out.println(query + " " + phoneNumber);
            } else {
                System.out.println("Not found");
            }

            
        }
        
        sc.close();
    }
}
