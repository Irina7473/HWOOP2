package org.example;

public class MusicalInstrument {
    String name;
    String sound;
    String desc;
    String history;

    public MusicalInstrument (String name, String sound, String desc, String history){
        this.name=name;
        this.sound=sound;
        this.desc=desc;
        this.history=history;
    }

    public void Sound(){
        System.out.println("���� ����������� : " +sound);
    }
    public void Show(){
        System.out.println("�������� ����������� : " +name);
    }
    public void Desc(){
        System.out.println("�������� ����������� : " +desc);
    }
    public void History(){
        System.out.println("������� �������� ����������� : " +history);
    }

}


  //  Violin  Trombone  Ukulele    Cello