package main.java;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any name of any cat: ");
        String catNameInput = sc.nextLine();
        Cat catOne = new Cat(catNameInput);

        System.out.println(catOne.getCatBreed());

        ObjectMapper mapper = new ObjectMapper();
        Cat cat = newCat();

        try {
            mapper.writeValue(new File("cat.json"), cat.catBreeds);
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cat.catBreeds);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Cat newCat() {
        Cat cat = new Cat();

        Map<String, String> catBreeds = new HashMap<>();
        catBreeds.put("Garfield", "Orange Tabby");
        catBreeds.put("Mr.Tinkles", "Persian");
        catBreeds.put("Calico", "Exotic Shorthair");

        cat.setCatBreeds(catBreeds);

        return cat;
    }

}
