import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    List<Animal> animals = new ArrayList<>();
    animals.add(new Cow("Cow", "MOO"));
    animals.add(new Dog("Dog", "WOOF"));
    animals.add(new Cat("Cat", "Meow"));
    animals.add(new Sheep("Sheep", "Bahhh"));

    System.out.println("Old MacDonald Had A Farm");
    System.out.println("Brought to you by Java!");
    System.out.println("");

    for(int i=1; i < animals.size(); i++) {
      animals.get(i).singVerse();
    }
    // TODO: create an array of Animal objects and call `singVerse()` on each of them
  }
}
