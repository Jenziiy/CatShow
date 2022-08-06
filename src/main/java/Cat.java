package main.java;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Cat {

    private String catName, catBreed;
    Map<String, String> catBreeds;

    public Cat() {

    }

    public Cat(String catName, String catBreed) {
        this.catName = catName;
        this.catBreed = catBreed;
    }

    public Cat(String catName) {
        this.catName = catName;
    }

    public String getCatBreed() {
        if (catName != null) {
            if (catName.equalsIgnoreCase("Nacho")) {
                catBreed = "Maine Coon";
            } else if (catName.equalsIgnoreCase("Olivier")) {
                catBreed = "PersianxRagdoll";
            } else {
                if (catBreed == null) { catBreed = "European shorthair"; }
               Map<String, String> catBreeds = new HashMap<>();
                catBreeds.put(catName, catBreed);
                this.setCatBreeds(catBreeds);
                return catName + " did not exist yet in the database and was added.";
            }

        }
        return catName + " is a " + catBreed;
    }


    public Map<String, String> getCatBreeds() {
        return catBreeds;
    }

    public void setCatBreeds(Map<String, String> catBreeds) {
        this.catBreeds = catBreeds;

        catBreeds.put("Garfield", "Orange Tabby");
        catBreeds.put("Mr.Tinkles", "Persian");
        catBreeds.put("Calico", "Exotic Shorthair");

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File("cat.json"), this.catBreeds);
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this.catBreeds);
            System.out.println(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
