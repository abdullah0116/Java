public class Poodle extends Dog {

    private String name;
    private String color = "White";
    private String breed = "Poodle";


    public String getBreed() {
      return breed;
    }

    public String getColor() {
      return color;
    }

    Poodle(String name) {
      super(name);
    }

      public static void main(String[] args) {
        Poodle poodle = new Poodle("YourPoo");
        System.out.println("Name: " + poodle.getName());
        System.out.println("Sound: " + poodle.getSound());
        System.out.println("Color: " + poodle.getColor());
        System.out.println("Weight: " + poodle.getWeight() + " Pounds");
        System.out.println("Breed: " + poodle.getBreed());
      }
}
