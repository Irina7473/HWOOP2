package org.example;

public class Main {
    public static void main(String[] args)
    {

        //Задание 1
        Builder b1= new Builder("Иван", "Иванов", 27, "каменщик");
        Pilot p1 = new Pilot("Ольга", "Петрова", 26, 2);
        System.out.println("Список людей разных профессий");
        b1.shouInfo();
        b1.brickwork();
        p1.shouInfo();
        p1.aviating();


        //Задание 2

    }
}