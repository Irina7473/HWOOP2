package org.example;

public class Human {
 private String firstName;
 private String lastName;
 private int age;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastNamestName(String lastNamestName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
public Human (String firstName, String lastName, int age)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public void shouInfo(){
        System.out.println(firstName + " " + lastName + " "+ age + " лет");
}

}
