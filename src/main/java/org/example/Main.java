package org.example;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        Builder b1 = new Builder("Иван", "Иванов", 27, "каменщик");
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
        aqua.priceReduce(25, 0);
        aqua.shouAmount();
        Product milk = new Product("1 литр молока", "рубль", "копейки");
        milk.priceSetting(60, 120);
        milk.shouAmount();
        milk.priceReduce(2, 15);
        milk.shouAmount();
        milk.priceReduce(0, 45);
        milk.shouAmount();
        System.out.println("---------------------------------");

        //Задание 2 и 4 не стала делать, они похжи на 1 и 3

        //Задание 5
        Violin v = new Violin("Виолончель", "писк", "смычковый музыкальный инструмент с 4-мя струнами, настроенными " +
                "по квинтам: Cб Gб Dм Aм. По высоте звучания занимает промежуточное положение между более высоким альтом и низким контрабасом.", "Появление виолончели относится к началу XVI века. Первоначально она применялась как басовый инструмент для сопровождения пения или исполнения на инструменте более высокого регистра.");
        v.Show();
        v.Sound();
        v.Desc();
        v.History();
        System.out.println("---------------------------------");
        Ukulele u = new Ukulele("Укулеле", "звук укулеле", " гавайская четырёхструнная разновидность гитары, " +
                "используемая для аккордового сопровождения песен и игры соло", "Укулеле появилась на Гавайских островах во второй половине XIX века, куда её, под названием машети да браса (порт. machete da bra?a), завезли португальцы с острова Мадейра.");
        u.Show();
        u.Sound();
        u.Desc();
        u.History();
        System.out.println("---------------------------------");

        //Задание 6
        Array nums=new Array(new int[]{3, 4, 1, 5, 2});
        nums.Show();
        System.out.println("Max = " +  nums.Max());
        System.out.println("Min = " +  nums.Min());
        System.out.println("AVG = " +  nums.AVG());
        nums.SortAsc();
        nums.Show();
        nums.SortDesc();
        nums.Show();
        System.out.println("---------------------------------");

        //Задание 7


    }
}