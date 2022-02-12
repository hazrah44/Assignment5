package com.company;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Assignment4
interface StringFunction {
    String run(String string);
}
public class Main {

    public static void main(String[] args) throws IOException {

        // demonstration of filename: hello.txt
        File str1 = new File("hello.txt");
        FileReader fr1 = new FileReader(str1);
        BufferedReader br = new BufferedReader(fr1);
        String line;
        System.out.println(
                "The animal list: ");
        while ((line = br.readLine()) != null) {
            // process the line
            System.out.println(line);
        }
        br.close();
        fr1.close();

        // Create an ArrayList object
        String str[] = new String[]{"1:", "Alpaca", "2:", "Antelope", "3:", "Leopard"};
        List<String> list = Arrays.asList(str);
        System.out.println("Please enter the number list: " + list);

        Scanner myAnimalSelection = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter you animal with letter L: ");

        //Code Showing stream()
        String userInput = myAnimalSelection.nextLine();
        List<String> result = list.stream().filter(s -> s.startsWith("L")).
                collect(Collectors.toList());
        System.out.println(result);

        //reading file
        try {
            FileReader fr = new FileReader("helloInput.txt");
            FileWriter fw = new FileWriter("helloOutput.txt");
            String strstr = "";

            int i;
            while ((i = fr.read()) != -1) {
                strstr += (char) i;
            }
            System.out.println(strstr);
            fw.write(strstr);
            fr.close();
            fw.close();

            // Display message
            System.out.println(
                    "File reading and writing both done");
        }
        // Catch block to handle the exception
        catch (IOException e) {
            // Display message

            // Create an ArrayList object
            ArrayList<String> animal = new ArrayList<String>();
            Scanner myNewAnimal = new Scanner(System.in);

            System.out.println("Enter New Animal: ");
            String userNewAnimal = myNewAnimal.nextLine();
            System.out.println("Great! You enter a new animal " + userNewAnimal);
            animal.add(userNewAnimal);

            //Use a lamba expression in the ArrayList's forEach() method to print every item in the list:
            animal.forEach((n) -> {
                System.out.println(n);
            });
        }
        // method which takes a lambda expression as a parameter:
        System.out.println();
        StringFunction exclaim = (s) -> s + "!";
        printFormatted("Hello User", exclaim);

    }

    public static void printFormatted(String string, StringFunction format) {
        String result = format.run(string);
        System.out.println(result);


        Animal alpaca = new Alpaca();
        Animal antelope = new Antelope();
        Animal leopard = new Leopard();

        //// using Scanner Class
        Scanner myName = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter you name to continue: ");
        String userName = myName.nextLine();
        System.out.println("Welcome: " + userName + " " + "\n");

        //getter and setter
        Alpaca myObj = new Alpaca();
        // Set the value of the name variable to "Sophie"
        myObj.setName("Sophie");

        Antelope myObj1 = new Antelope();
        // Set the value of the name variable to "Sophie"
        myObj1.setName("Lily");

        Leopard myObj2 = new Leopard();
        // Set the value of the name variable to "Sophie"
        myObj2.setName("Thomas");
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num = myNumber.nextDouble();
        if (num == 1) {
            // Outputs "Sophie"
            //getter
            System.out.println(myObj.getName() + " the" + " " + alpaca);
            alpaca.animalSound();
        } else if (num == 2) {
            // Outputs "Lily"
            //getter
            System.out.println(myObj1.getName() + " the" + " " + antelope);
            antelope.animalSound();
        } else if (num == 3) {
            // Outputs "Thomas"
            //getter
            System.out.println(myObj2.getName() + " the" + " " + leopard);
            leopard.animalSound();
        } else
                System.out.println("There are some IOException");
            }
}








