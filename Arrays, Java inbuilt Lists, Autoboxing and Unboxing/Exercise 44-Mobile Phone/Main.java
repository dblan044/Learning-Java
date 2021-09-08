import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {
	boolean quit = false;
        startPhone();
        printActions();
        
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    phone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5: 
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }

        }

    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter phone number: ");
        String phone = sc.nextLine();
        
        Contacts newContact = Contacts.createContact(name, phone);
        
        if(Main.phone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = "+ phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }
    
    private static void updateContact(){
        System.out.println("Enter exisitng contact name: ");
        String name = sc.nextLine();
        
        Contacts existingContactRec = phone.queryContact(name);
        
        if(existingContactRec == null){
            System.out.println("Contact not found");
            return;
        }
        
        System.out.println("Enter new contact name: ");
        String newName = sc.nextLine();
        
        System.out.println("Enter new phone number: ");
        String newNum = sc.nextLine();
        
        Contacts newContact = Contacts.createContact(newName, newNum);
        phone.updateContact(existingContactRec, newContact);
        
        if(phone.updateContact(existingContactRec, newContact)){
            System.out.println("Success in updating record");
        }else{
            System.out.println("Error updating record");
        }
    }

    private static void removeContact(){
        System.out.println("Enter exisitng contact name: ");
        String name = sc.nextLine();
        
        Contacts existingContactRec = phone.queryContact(name);
        
        if(existingContactRec == null){
            System.out.println("Contact not found");
            return;
        }
        
        if(phone.removeCOntact(existingContactRec)){
            System.out.println("Success in deleting contact");
        }else{
            System.out.println("Error deleteing contact");
        }
    }
    
    private static void queryContact(){
        System.out.println("Enter exisitng contact name: ");
        String name = sc.nextLine();
        
        Contacts existingContactRec = phone.queryContact(name);
        
        if(existingContactRec == null){
            System.out.println("Contact not found");
            return;
        }
        
        System.out.println("Name: " + existingContactRec.getName() + " phone number is " +
               existingContactRec.getPhoneNumber());
    }
    
    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                           "1  - to print contacts\n" +
                           "2  - to add a new contact\n" +
                           "3  - to update an existing contact\n" +
                           "4  - to remove an existing contact\n" +
                           "5  - query if an existing contact exists\n" +
                           "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}