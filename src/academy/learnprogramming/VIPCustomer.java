package academy.learnprogramming;

public class VIPCustomer {
    private String name;
    private double credLimit;
    private String emailAddress;

    public VIPCustomer (){
        this("bob", 100d, "default");
    }

    public VIPCustomer(String name, double credLimit) {
        this(name, credLimit, "unknown");
    }

    public VIPCustomer(String name, double credLimit, String emailAddress) {
        this.name = name;
        this.credLimit = credLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCredLimit() {
        return credLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
