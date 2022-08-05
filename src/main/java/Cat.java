package main.java;

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
                catBreed = "Generic";
            }

        }
        return catName + " is a " + catBreed;
    }


    public Map<String, String> getCatBreeds() {
        return catBreeds;
    }

    public void setCatBreeds(Map<String, String> catBreeds) {
        this.catBreeds = catBreeds;
    }

}
