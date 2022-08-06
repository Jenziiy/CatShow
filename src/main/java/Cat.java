package main.java;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SequenceWriter;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class Cat {

    private String catName, catBreed;
    Map<String, String> catBreeds;

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
                if (catBreed == null || catBreed == "") { catBreed = "European shorthair"; }
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

//        catBreeds.put("Garfield", "Orange Tabby");
//        catBreeds.put("Mr.Tinkles", "Persian");
//        catBreeds.put("Calico", "Exotic Shorthair");

        try {
            File catFile = new File("c:\\users\\jeani\\Desktop\\cat.json");
            FileWriter fileWriter = new FileWriter(catFile, true);
            ObjectMapper mapper = new ObjectMapper();

            //JsonGenerator g = mapper.getFactory().createGenerator(new FileOutputStream(catFile));
            SequenceWriter seqWriter = mapper.writer().writeValuesAsArray(fileWriter);
            seqWriter.write(this.catBreeds);
            //String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this.catBreeds);
            //System.out.println(jsonString);
            seqWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
