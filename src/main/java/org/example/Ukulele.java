package org.example;

public class Ukulele extends MusicalInstrument{
    public Ukulele(String name, String sound, String desc, String history) {
        super(name, sound, desc, history);
    }

    @Override
    public void Sound() {
        System.out.println("Звук укулеле : " +sound);
    }
}
