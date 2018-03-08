package nl.natasjaiebrink;

public class Animal extends Molecule {

    private String name;

  public Animal (String name) {
      this.name = name;

  }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
