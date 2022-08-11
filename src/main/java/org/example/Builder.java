package org.example;

public class Builder extends Human {
    private String specialty;
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public Builder(String firstName, String lastName, int age, String specialty) {
        super(firstName, lastName, age);
        this.specialty=specialty;
    }
    public void shouInfo() {
        System.out.print("Строитель - " + specialty + " : ");
        super.shouInfo();
    }
    public void brickwork(){
        System.out.println("Я умею делать кирпичную кладку");
    }
}
