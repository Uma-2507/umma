package day15;
import day15.ContactService;

import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
        ContactService cns = new ContactService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("------- Menu -----");
            System.out.println("1. Add contact");
            System.out.println("2. Show contact");
            System.out.println("3. Update email");
            System.out.println("4. Remove contact");
            System.out.println("5. Show all contacts");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the ID:");
                    int id = sc.nextInt();
                    System.out.println("Enter the name:");
                    String name = sc.next();
                    System.out.println("Enter the email:");
                    String email = sc.next();
                    Contact contact = new Contact(id, name, email);
                    cns.addContact(contact);  // Corrected
                    break;

                case 2:
                    System.out.println("Enter the ID:");
                    int id2 = sc.nextInt();
                    cns.showContact(id2);  // Corrected
                    break;

                case 3:
                    System.out.println("Enter the ID:");
                    int id3 = sc.nextInt();
                    System.out.println("Enter the new email:");
                    String newEmail = sc.next();
                    cns.updateContactEmail(id3, newEmail);  // Corrected
                    break;

                case 4:
                    System.out.println("Enter the ID:");
                    int id4 = sc.nextInt();
                    cns.removeContact(id4);  // Corrected
                    break;

                case 5:
                    cns.showAllContacts();  // Corrected
                    break;

                case 6:
                    System.out.println("Thanks for using the application.");
                    System.exit(0);  // Corrected
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
