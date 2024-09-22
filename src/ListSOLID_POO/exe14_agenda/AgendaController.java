package ListSOLID_POO.exe14_agenda;

import java.util.ArrayList;
import java.util.List;

public class AgendaController {

    private List<Contact> contacts;
    private InputAgenda input;

    public AgendaController() {
        this.contacts = new ArrayList<>();
        input = new InputAgenda();
    }

    public void addContact() {
        String name = input.getInput("Enter contact name: ");
        String phone = input.getInput("Enter phone: ");
        contacts.add(new Contact(name, phone));
        System.out.println("Contact added successfully");
    }

    public void removeContact() {
        String nameOrPhone = input.getInput("Enter contact name to remove: ");
        Contact contact = searchContact(nameOrPhone);
        if (contact != null) {
            contacts.remove(contact);
            System.out.println("Contact removed successfully");
        }else{
            System.out.println("Contact not found");
        }
    }

    public void editContact() {
        String nameOrPhone = input.getInput("Enter contact name or phone to edit: ");
        Contact contact = searchContact(nameOrPhone);
        if (contact != null) {
            String newName = input.getInput("Enter new contact name: ");
            String newPhone = input.getInput("Enter new phone number: ");

            if(!newName.isEmpty() && !newPhone.isEmpty()) {
                contact.setName(newName);
                contact.setPhoneNumber(newPhone);
            }

            System.out.println("Contact edited successfully");
        }else {
            System.out.println("Contact not found");
        }
    }

    public Contact searchContact(String nameOrPhone) {
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(nameOrPhone)){
               return c;
            } else if (c.getPhoneNumber().equalsIgnoreCase(nameOrPhone)){
               return c;
            }
        }
        return null;
    }

    public void displayContacts() {
        if(contacts.isEmpty()) {
            System.out.println("No contacts found");
        } else {
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }
    }

    public void close(){
        input.close();
    }
}
