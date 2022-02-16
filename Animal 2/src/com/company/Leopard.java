package com.company;

public class Leopard extends Animal {

    // private = restricted access
    private String name;
    // Getter
    public String getName() {
        return name;
    }
    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public void animalSound() {
        System.out.println("I can Roar!");
    }


    public String toString() {
        return "Leopard";
    }
}