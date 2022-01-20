package academy.learnprogramming;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer (String name, double initialAmount){
        if (findCustomer(name) == null){
            this.customers.add(new Customer(name, initialAmount));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String name, double amount){
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        } else {
            return false;
        }
    }

    private Customer findCustomer (String name) {
        for (int i = 0; i < this.customers.size(); i ++){
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(name)){
                return checkedCustomer;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
