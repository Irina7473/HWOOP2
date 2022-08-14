package org.example;

public class Main {
    public static void main(String[] args) {

        //������� 1
        Builder b1 = new Builder("����", "������", 27, "��������");
        Pilot p1 = new Pilot("�����", "�������", 26, 2);
        System.out.println("������ ����� ������ ���������");
        b1.shouInfo();
        b1.brickwork();
        p1.shouInfo();
        p1.aviating();
        System.out.println("---------------------------------");

        //������� 3
        Product aqua = new Product("1 ���� ����", "�����", "�������", 22, 15);
        aqua.shouAmount();
        aqua.priceReduce(25, 0);
        aqua.shouAmount();
        Product milk = new Product("1 ���� ������", "�����", "�������");
        milk.priceSetting(60, 120);
        milk.shouAmount();
        milk.priceReduce(2, 15);
        milk.shouAmount();
        milk.priceReduce(0, 45);
        milk.shouAmount();
        System.out.println("---------------------------------");

        //������� 2 � 4 �� ����� ������, ��� ����� �� 1 � 3

        //������� 5
        Violin v = new Violin("����������", "����", "��������� ����������� ���������� � 4-�� ��������, ������������ " +
                "�� �������: C� G� D� A�. �� ������ �������� �������� ������������� ��������� ����� ����� ������� ������ � ������ �����������.", "��������� ���������� ��������� � ������ XVI ����. ������������� ��� ����������� ��� ������� ���������� ��� ������������� ����� ��� ���������� �� ����������� ����� �������� ��������.");
        v.Show();
        v.Sound();
        v.Desc();
        v.History();
        System.out.println("---------------------------------");
        Ukulele u = new Ukulele("�������", "���� �������", " ��������� �������������� ������������� ������, " +
                "������������ ��� ����������� ������������� ����� � ���� ����", "������� ��������� �� ��������� �������� �� ������ �������� XIX ����, ���� �, ��� ��������� ������ �� ����� (����. machete da bra?a), ������� ����������� � ������� �������.");
        u.Show();
        u.Sound();
        u.Desc();
        u.History();
        System.out.println("---------------------------------");

        //������� 6
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

        //������� 7


    }
}