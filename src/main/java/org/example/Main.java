package org.example;

public class Main {
    public static void main(String[] args)
    {

        //������� 1
        Builder b1= new Builder("����", "������", 27, "��������");
        Pilot p1 = new Pilot("�����", "�������", 26, 2);
        System.out.println("������ ����� ������ ���������");
        b1.shouInfo();
        b1.brickwork();
        p1.shouInfo();
        p1.aviating();


        //������� 2

    }
}