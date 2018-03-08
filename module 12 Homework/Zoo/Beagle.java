public class Beagle extends Dog {

  private String name;
  private String color = "White";
  private String breed = "Beagle";


  public String getBreed() {
    return breed;
  }

  public String getColor() {
    return color;
  }

  Beagle(String name) {
    super(name);
  }


    public static void main(String[] args) {
      Beagle beagle = new Beagle("YourBoI");
      System.out.println("Name: " + beagle.getName());
      System.out.println("Sound: " + beagle.getSound());
      System.out.println("Color: " + beagle.getColor());
      System.out.println("Weight: " + beagle.getWeight() + " Pounds");
      System.out.println("Breed: " + beagle.getBreed());
    }
}
