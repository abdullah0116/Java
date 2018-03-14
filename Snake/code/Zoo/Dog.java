public class Dog extends Animal {

  private String name;
  private String sound = "Woof Woof";
  private String color = "White";
  private int weight = 54;
  private String breed = "IDK";

  public String getBreed() {
    return breed;
  }

  public String getColor() {
    return color;
  }

  public int getWeight() {
    return weight;
  }

  public String getSound() {
    return sound;
  }

  Dog(String name) {
    super(name);
  }

  public static void main(String[] args) {
    Dog dog = new Dog("Doggy");
    System.out.println("Name: " + dog.getName());
    System.out.println("Sound: " + dog.getSound());
    System.out.println("Color: " + dog.getColor());
    System.out.println("Weight: " + dog.getWeight() + " Pounds");
    System.out.println("Breed: " + dog.getBreed());
  }
}
