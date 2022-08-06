package main.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cat catOne = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any name of any cat: ");
        String catNameInput = sc.nextLine();

        System.out.println("(Optionally) Please enter the breed of your cat ");
        String catBreed = sc.nextLine();
        if ( catBreed == null) { catOne = new Cat(catNameInput);
        } else if (catNameInput != "" && catBreed != "") {
        catOne = new Cat(catNameInput, catBreed); }

       if (catOne != null) { System.out.println(catOne.getCatBreed()); }
       else {System.out.println("Please fill out a catname at least for this to work out");}


    }
}
