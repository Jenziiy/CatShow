package main.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any name of any cat: ");
        String catNameInput = sc.nextLine();
        Cat catOne = new Cat(catNameInput);

        System.out.println(catOne.getCatBreed());


    }
}
