package com.company;

public class Antelope extends Animal{
    // private = restricted access
    private String name;

    //
    public Antelope() {
        super();
    }

    // Getter
    public String getName() {
        return name;
    }
    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public void animalSound() {
        System.out.println("I can make a sound...snort!!!.");
    }
    // return
    public String toString() {
        return "Antelope";
    }
}
