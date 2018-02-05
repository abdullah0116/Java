import java.util.Scanner;
import java.util.StringJoiner;

public class CharTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringJoiner sj = new StringJoiner(",");
    int amount = -1;
    System.out.print("Enter your message: ");
    String userInput = sc.nextLine();

    System.out.println("Here are the characters in order: ");
    System.out.println("");

    for (int i = 0; i < userInput.length() ; i++ ) {
      char output = userInput.charAt(i);
      amount++;
      System.out.println(amount + ": " + "'" +output + "'");

    }
  }
}
