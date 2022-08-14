package org.example;

public class Violin extends  MusicalInstrument{
    public Violin(String name, String sound, String desc, String history) {
        super(name, sound, desc, history);
    }
    @Override
    public void Sound() {
        System.out.println("Звук виоллнчели : " +sound);
    }
}
