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
    }

}
