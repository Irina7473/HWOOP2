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
        System.out.println("Звук инструмента : " +sound);
    }
    public void Show(){
        System.out.println("Название инструмента : " +name);
    }
    public void Desc(){
        System.out.println("Описание инструмента : " +desc);
    }
    public void History(){
        System.out.println("История создания инструмента : " +history);
    }

}


  //  Violin  Trombone  Ukulele    Cello