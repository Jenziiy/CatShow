package main.java;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Cat {

    private String catName, catBreed;

    public Cat(String catName, String catBreed) {
        this.catName = catName;
        this.catBreed = catBreed;
    }

    public Cat(String catName) {
        this.catName = catName;
    }

    public String getCatBreed() {
        if ( catName.equalsIgnoreCase("Nacho")) {
                catBreed = "Maine Coon";
        } else if ( catName.equalsIgnoreCase("Olivier")) {
            catBreed = "PersianxRagdoll";
        } else {
            catBreed = "Generic";
        }
        return catName + " is a " + catBreed;
    }

    public void appendCat(String catName, String catBreed) {
        this.catName =  catName;
        this.catBreed = catBreed;

        ObjectMapper mapper = new ObjectMapper();


        try {
            mapper.writeValue(new File("cat.json"), catName + catBreed);
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(catName+ "" + catBreed);
            System.out.println(jsonString);
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

}
