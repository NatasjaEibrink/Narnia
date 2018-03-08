package nl.natasjaiebrink;

public class Closet {

    private boolean isClosetBroken;

    private Material material;


    public void kickCloset(){
        System.out.println("Closet is kicked");
    }

    public void isClosetBroken(){

        if (this.isClosetBroken) {
            System.out.println("Closet is Broken");
        } else {
            this.isClosetBroken = true;
            System.out.println("Kick Again");
        }

    }

    public void enterCloset() {
        System.out.println("Closet is entered");
    }

}


