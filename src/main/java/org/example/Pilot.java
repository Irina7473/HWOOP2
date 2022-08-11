package org.example;

public class Pilot extends Human {
    private int grade;
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public Pilot(String firstName, String lastName, int age, int grade) {
        super(firstName, lastName, age);
        this.grade=grade;
    }
    public void shouInfo() {
        System.out.print("Пилот " + grade + " класса : ");
        super.shouInfo();
    }
    public void aviating(){
        System.out.println("Я умею управлять самолетом");
    }
}
