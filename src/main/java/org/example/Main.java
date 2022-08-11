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
        System.out.println("---------------------------------");

        //Задание 3
        Product aqua = new Product("1 литр воды", "рубль", "копейки", 22, 15);
        aqua.shouAmount();
        aqua.priceReduce(25,0);
        aqua.shouAmount();
        Product milk = new Product("1 литр молока", "рубль", "копейки");
        milk.priceSetting(60, 120);
        milk.shouAmount();
        milk.priceReduce(2, 15);
        milk.shouAmount();
        milk.priceReduce(0, 45);
        milk.shouAmount();
        System.out.println("---------------------------------");

    }
}