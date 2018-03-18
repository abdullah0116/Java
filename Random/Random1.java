import java.util.Random; // import tells us where to find Random

public class Random1 {
  public static void main(String[] args) {
    Random rand = new Random();
    System.out.println(rand.nextInt()); // print a number between 0 and 9
  }
}
