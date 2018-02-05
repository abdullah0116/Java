import java.util.Scanner;
public class CalculatorTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("> ");
    String userInput = sc.next();

    if (userInput.equals("quit")) {
      System.out.println("> goodbye");
    } else {
      while (true) {
        System.out.print("> ");

        int a = Integer.parseInt(userInput);
        String op = sc.next();
        int b = sc.nextInt();

        if (op.equals("+")) {
          int total = a + b;
          System.out.println("= " + total);
        } else if (op.equals("-")) {
          int total = a - b;
          System.out.println("= " + total);
        } else if (op.equals("/")) {
          int total = a / b;
          System.out.println("= " + total);
        } else if (op.equals("*")) {
          int total = a * b;
          System.out.println("= " + total);
        } else {
          System.out.println("Sorry buddy! but i cant accept what you just entered.");
        }
      }
    }

    // while (true) {
    //   System.out.print("> ");
    //
    //   int a = Integer.parseInt(userInput);
    //   String op = sc.next();
    //   int b = sc.nextInt();
    //
    //   if (op.equals("+")) {
    //     int total = a + b;
    //     System.out.println("= " + total);
    //   } else if (op.equals("-")) {
    //     int total = a - b;
    //     System.out.println("= " + total);
    //   } else if (op.equals("/")) {
    //     int total = a / b;
    //     System.out.println("= " + total);
    //   } else if (op.equals("*")) {
    //     int total = a * b;
    //     System.out.println("= " + total);
    //   } else {
    //     System.out.println("Sorry buddy! but i cant accept what you just entered.");
    //   }
    // }
  }
}
