package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMobilePhone {
    private ArrayList<ArrayListContact> arrayListContactArrayList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void printMenu(){
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter choice ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printListOfContacts();
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
                    System.out.println("Enter Name to search for");
                    String name = scanner.nextLine();
                    int indexOf = searchForContact(name);
                    if (indexOf > -1){
                        System.out.println("Contact: " + name + " is contact number " + (indexOf + 1));
                    } else {
                        System.out.println("Contact: " + name + " not found");
                    }

                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private void removeContact() {
        System.out.println("Enter Name to remove");
        String name = scanner.nextLine();
        int indexOf = searchForContact(name);
        if (indexOf > -1){
            arrayListContactArrayList.remove(indexOf);
        } else {
            System.out.println("Name does not exist to remove");
        }

    }

    private void updateContact() {
        ArrayListContact arrayListContact = new ArrayListContact();
        System.out.println("Enter Name to update");
        String name = scanner.nextLine();
        int indexOf = searchForContact(name);
        if (indexOf > -1){
            System.out.println("Enter name to change it to");
            String updateName = scanner.nextLine();
            arrayListContact.setName(updateName);
            System.out.println("Enter Phone Number");
            arrayListContact.setPhoneNumber(scanner.nextLine());
            arrayListContactArrayList.set(indexOf,arrayListContact);
        } else {
            System.out.println("Name does not exist to update");
        }
    }

    private int searchForContact(String name) {
        int indexOf = -1;

        for (int i =0; i < arrayListContactArrayList.size(); i ++){
            if (arrayListContactArrayList.get(i).getName().contains(name)){
                indexOf = i;
            }
        }

        return indexOf;
    }

    private void addNewContact() {
        ArrayListContact arrayListContact = new ArrayListContact();
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        if (searchForContact(name) == -1){
            arrayListContact.setName(name);
            System.out.println("Enter Phone Number");
            arrayListContact.setPhoneNumber(scanner.nextLine());
            arrayListContactArrayList.add(arrayListContact);
        } else {
            System.out.println("Name already exists");
        }
    }

    private void printListOfContacts() {
        for (int i =0; i < arrayListContactArrayList.size(); i ++){
            System.out.println("contact " + (i + 1 )+ " is " + arrayListContactArrayList.get(i).getName() + " " + arrayListContactArrayList.get(i).getPhoneNumber());
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - print menu instructions");
        System.out.println("\t 1 - print list of contacts");
        System.out.println("\t 2 - add new contact");
        System.out.println("\t 3 - update contact");
        System.out.println("\t 4 - remove contact");
        System.out.println("\t 5 - search for contact");
        System.out.println("\t 6 - quit application");
    }
}
