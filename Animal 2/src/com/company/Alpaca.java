package com.company;

public class Alpaca extends Animal {
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
   //Alpaca speak
    public void animalSound() {
        System.out.println("I can make  a sound Cluck!!!!!!!!!!!!!!.");
    }
        public String toString () {
            return "Alpaca";
        }
    }
