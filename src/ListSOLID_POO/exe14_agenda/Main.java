package ListSOLID_POO.exe14_agenda;

public class Main {
    public static void main(String[] args) {

        AgendaController a =  new AgendaController();
        InputAgenda in = new InputAgenda();

        boolean running = true;
        while (running) {
            System.out.println("1 - Add contact");
            System.out.println("\n2 - Edit contact");
            System.out.println("\n3 - Remove contact");
            System.out.println("\n4 - Search contact");
            System.out.println("\n5 - View all contacts");
            System.out.println("\n6 - Exit");

            String option = in.getInput("Enter option");

            switch (option){
                case "1":
                    a.addContact();
                    break;
                case "2":
                    a.editContact();
                    break;
                case "3":
                    a.removeContact();
                    break;
                case "4":
                    String nameOrPhone = in.getInput("Enter the name of the contact or number: ");
                    Contact c = a.searchContact(nameOrPhone);
                    if (c != null) {
                        System.out.println(c);
                    } else {
                        System.out.println("Contact not found");
                    }
                    break;
                case "5":
                    a.displayContacts();
                    break;
                case "6":
                    System.out.print("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Choose again");
            }
        }

        a.close();
    }
}