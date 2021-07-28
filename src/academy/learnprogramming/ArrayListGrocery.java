package academy.learnprogramming;

import java.util.ArrayList;

public class ArrayListGrocery {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("list " + groceryList.size() + " items");
        for (int i = 0; i < groceryList.size(); i ++){
            System.out.println((i + 1) + " , " + groceryList.get(i));
        }
    }

    public void updateItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position >= 0){
            updateItem(position, newItem);
        }
    }

    private void updateItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("updated item " + (position + 1) + " to " + newItem );
    }

    public void removeItem (String item){
        int position = findItem(item);
        if (position >= 0){
            removeItem(position);
        }
    }

    private void removeItem (int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
        //boolean exists = groceryList.contains(searchItem);
/*        int position = groceryList.indexOf(searchItem);
        if (position >=  0){
            return groceryList.get(position);
        }
        return null;*/
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }
        return false;
    }
}
