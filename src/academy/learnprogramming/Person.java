package academy.learnprogramming;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        boolean isValidAge = (age >= 0 && age <= 100);
        if (isValidAge){
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen (){
        return (this.age > 12 && this.age < 20);
    }

    public String getFullName (){
        if (this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }
        if (this.lastName.isEmpty()){
            return this.firstName;
        }
        if (this.firstName.isEmpty()){
            return this.lastName;
        } else {
            return this.firstName + " " + this.lastName;
        }

    }


}
