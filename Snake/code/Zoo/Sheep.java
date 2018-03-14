public class Sheep extends Animal{

  private String name;
  private String sound = "Baahahaa...";
  private String color = "White";

  public String getColor() {
    return color;
  }

  Sheep(String name){
    super(name);
  }

  public String getSound() {
    return sound;
  }

  public static void main(String args[]){
    Sheep shelly = new Sheep("Shelly");
    System.out.println("Name: " + shelly.getName());
    System.out.println("Sound: " +shelly.getSound());
    System.out.println("Color: "+ shelly.getColor());
  }
}
