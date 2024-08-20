import java.util.*;

public class ContactManager {

    static HashMap<String, Contact> contacts = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (true) {
            System.out.println("\n Contact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice:");

            int choice = scanner.nextInt();

            scanner.nextLine();


            
        }
    }
    
}
