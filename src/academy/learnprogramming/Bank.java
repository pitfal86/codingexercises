package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch (String name){
        if (findBranch(name) == null){
            this.branches.add(new Branch(name));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer (String branchName, String custName, double initialAmount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.newCustomer(custName, initialAmount);
        }
        return false;
    }

    public boolean addCustTransaction (String branchName, String custName, double amount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addCustomerTransaction(custName, amount);
        }
        return false;
    }

    private Branch findBranch (String name) {
        for (int i = 0; i < this.branches.size(); i ++){
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(name)){
                return checkedBranch;
            }
        }
        return null;
    }


    public boolean listCustomer(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if (branch != null){
            System.out.println("Customer for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i ++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + " " + (i + 1) + " ");
                if (showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> tranactions = branchCustomer.getTransactions();
                    for (int j = 0; j < tranactions.size(); j ++){
                        System.out.println(" " + (j + 1) + " " + "Amount " + tranactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

}
