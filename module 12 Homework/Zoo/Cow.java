public class Cow extends Animal{

  private String name;
  private String sound = "Moo...";
  private String color = "Brown";
  private int weight = 1400;

  public int getWeight() {
    return weight;
  }
  public String getColor() {
    return color;
  }
  Cow(String name){
    super(name);
  }

  public String getSound(){
    return sound;
  }

  public static void main(String args[]){
    Cow beefy = new Cow("beefy");
    System.out.println("Name: "  + beefy.getName());
    System.out.println("Sound: " + beefy.getSound());
    System.out.println("Color: " + beefy.getColor());
    System.out.println("Weight: "+ beefy.getWeight());
  }
}
