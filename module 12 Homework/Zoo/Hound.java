public class Hound extends Dog {

  private String name;
  private String sound = "Woof Woof";
  private String color = "White & Brown";
  private int weight = 54;
  private String breed = "Hound";


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

  Hound(String name) {
    super(name);
  }


    public static void main(String[] args) {
      Hound hound = new Hound("HoundYou");
      System.out.println("Name: " + hound.getName());
      System.out.println("Sound: " + hound.getSound());
      System.out.println("Color: " + hound.getColor());
      System.out.println("Weight: " + hound.getWeight() + " Pounds");
      System.out.println("Breed: " + hound.getBreed());
    }
}
