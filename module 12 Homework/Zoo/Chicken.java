public class Chicken extends Animal {
  private String name;
  private String sound = "Bak Bak" ;
  private String color = "Brown White";

  Chicken(String name) {
    super(name);
  }

  public String getSound() {
    return sound;
  }

  public String getColor() {
    return color;
  }

  public static void main(String[] args) {
    Chicken chicken = new Chicken("Chick");
    System.out.println("Name: "+chicken.getName());
    System.out.println("Sound: "+chicken.getSound());
    System.out.println("Color: "+chicken.getColor());
  }
}
