package academy.learnprogramming;

public class ArrayListContactSol {

    private String name;
    private String phoneNumber;

    public ArrayListContactSol(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static ArrayListContactSol createContact(String name, String phoneNumber){
        return new ArrayListContactSol(name, phoneNumber);
    }
}
