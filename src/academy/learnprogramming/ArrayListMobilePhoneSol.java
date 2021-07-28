package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMobilePhoneSol {

    private String myNumber;
    private ArrayList<ArrayListContactSol> myContacts;

    private static Scanner scanner = new Scanner(System.in);

    public ArrayListMobilePhoneSol(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<ArrayListContactSol>();
    }

    public void runApp (){
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\n Enter action: 6 to show");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    System.out.println("\n Shutting down");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    System.out.println("Enter new contact name");
                    String name = scanner.nextLine();
                    System.out.println("Enter new phone");
                    String phoneNumber = scanner.nextLine();
                    ArrayListContactSol arrayListContactSol = new ArrayListContactSol(name, phoneNumber);
                    if (addNewContact(arrayListContactSol)){
                        System.out.println("new contact added " + name + " " + phoneNumber);
                    } else {
                        System.out.println("cannot add " + name + " already on file");
                    }
                    break;
                case 3:
                    System.out.println("Enter existing contact name");
                    String existingName = scanner.nextLine();
                    ArrayListContactSol existingContactRecord = queryContact(existingName);
                    if (existingContactRecord == null){
                        System.out.println("Contact not found ");
                        return;
                    }
                    System.out.println("Enter new contact name");
                    String newName = scanner.nextLine();
                    System.out.println("Enter new contact number");
                    String newNumber = scanner.nextLine();
                    ArrayListContactSol newContact = ArrayListContactSol.createContact(newName, newNumber);
                    if (updateContact(existingContactRecord, newContact)){
                        System.out.println("update success");
                    } else {
                        System.out.println("error updating");
                    }
                    break;
                case 4:
                    System.out.println("Enter existing contact name");
                    String existingNameAgain = scanner.nextLine();
                    ArrayListContactSol existingContactRecordAgain = queryContact(existingNameAgain);
                    if (existingContactRecordAgain == null){
                        System.out.println("Contact not found ");
                        return;
                    }
                    if (removeContact(existingContactRecordAgain)){
                        System.out.println("Success deleted");
                    } else {
                        System.out.println("Error deleting");
                    }
                    break;
                case 5:
                    System.out.println("Enter existing contact name");
                    String existingNameAgainA = scanner.nextLine();
                    ArrayListContactSol existingContactRecordAgainA = queryContact(existingNameAgainA);
                    if (existingContactRecordAgainA == null){
                        System.out.println("Contact not found ");
                        return;
                    }
                    System.out.println("Name " + existingContactRecordAgainA.getName() + " number " + existingContactRecordAgainA.getPhoneNumber());
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    public void printContacts(){
        System.out.println("Contact List");
        for (int i = 0; i < this.myContacts.size(); i ++){
            System.out.println((i + 1) + this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone ....");
    }

    private static void printActions(){
        System.out.println("\nAvailable options: \npress");
        System.out.println("0 - to shutdown \n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update existing contact\n" +
                "4 - to remove a contact\n" +
                "5 - query if contact exists\n"+
                "6 - print list of available actions");
        System.out.println("Choose your action: ");
    }

    public boolean addNewContact(ArrayListContactSol contact){
        if (findContact(contact.getName()) >= 0){
            System.out.println("Contact already on file");
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(ArrayListContactSol oldContact, ArrayListContactSol newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0){
            System.out.println(oldContact.getName() + " not found");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name already exists: " + newContact.getName());
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " old replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact (ArrayListContactSol contact){
        int foundPosition = findContact(contact);
        if (foundPosition < 0){
            System.out.println(contact.getName() + " not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }

    private int findContact (ArrayListContactSol contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i = 0; i < this.myContacts.size(); i ++){
            ArrayListContactSol contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public ArrayListContactSol queryContact(String name){
        int position = findContact(name);
        if (position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public String queryContact(ArrayListContactSol contact){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }
}
