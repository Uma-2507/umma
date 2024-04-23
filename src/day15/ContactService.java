package day15;
import java.util.ArrayList;
import java.util.List;

public class ContactService {
    private List<Contact> contacts = new ArrayList<>();

    // Add a contact to the list
    public void addContact(Contact contact) {
        if (isExists(contact.getId())) {
            System.out.println("Contact with ID " + contact.getId() + " already exists.");
        } else {
            contacts.add(contact);
        }
    }

    // Remove a contact by ID
    public void removeContact(int id) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }
        int index = indexOf(id);
        if (index != -1) {
            contacts.remove(index);
            System.out.println("Contact with ID " + id + " removed successfully.");
        } else {
            System.out.println("Contact with ID " + id + " does not exist.");
        }
    }

    // Update contact email by ID
    public void updateContactEmail(int id, String newEmail) {
        int index = indexOf(id);
        if (index != -1) {
            Contact contact = contacts.get(index);
            contact.setEmail(newEmail);
            System.out.println("Contact with ID " + id + " updated successfully.");
        } else {
            System.out.println("Contact with ID " + id + " does not exist.");
        }
    }

    // Show a specific contact by ID
    public void showContact(int id) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }
        int index = indexOf(id);
        if (index != -1) {
            Contact contact = contacts.get(index);
            contact.showInfo();  // Corrected from `contacts.showInfo()`
        } else {
            System.out.println("Contact with ID " + id + " does not exist.");
        }
    }

    // Show all contacts
    public void showAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }
        for (Contact contact : contacts) {
            contact.showInfo();  // Corrected
            System.out.println("-----------------");
        }
    }

    // Check if a contact with a specific ID exists
    private boolean isExists(int id) {
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Helper method to find the index of a contact by ID
    private int indexOf(int id) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
