public abstract class Animal {

    private String name, sound;

  public Animal(String name, String sound) {
    this.name = name;
    this.sound = sound;
  }

  public final String getName() {
    return this.name;
  }

  public final String getSound() {
    return this.sound;
  }

  public final void singVerse() {
    System.out.println("Old MacDonald had a farm, E I E I O!");
    System.out.println("And on that farm he had a " + getName() + ", E I E I O!");
    System.out.println("With a " + getSound() +","+ getSound() + ", here, and a "+ getSound() +","+ getSound() + " there,");
    System.out.println("Here a " + getSound() + ", there a " + getSound() + ", everywhere a " + getSound() +","+ getSound() + ",");
    System.out.println("Old MacDonald had a farm, E I E I O!");
    System.out.println("");


    // TODO: finish this!!! Look at the homework instructions to know what to put here.
  }
}
