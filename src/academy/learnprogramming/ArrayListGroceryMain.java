package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGroceryMain {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayListGrocery groceryList = new ArrayListGrocery();

    public void scannerThing (){
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
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItemThing();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void processArrayList(){

        // Method 1 copy array
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        // Method 2 copy array
        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        // Method 3 copy array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - print choice");
        System.out.println("\t 1 - print list");
        System.out.println("\t 2 - add item");
        System.out.println("\t 3 - modify list");
        System.out.println("\t 4 - remove item");
        System.out.println("\t 5 - search for item");
        System.out.println("\t 6 - process ");
        System.out.println("\t 7 - quit application");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item to modify ");
        String itemNumber = scanner.nextLine();
        //scanner.nextLine();
        System.out.print("Enter new item ");
        String newItem = scanner.nextLine();
        groceryList.updateItem( itemNumber, newItem);
    }

    public static void removeItemThing (){
        System.out.print("Enter item name ");
        String itemNumber = scanner.nextLine();
        //scanner.nextLine();
        groceryList.removeItem(itemNumber);
    }

    public static void searchForItem(){
        System.out.print("Item to search for ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + " not in list");
        }
    }
}
