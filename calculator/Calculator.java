import java.util.Scanner;
public class Calculator {
  public void CalculatorApp() {
    Scanner sc = new Scanner(System.in);
    //int userInput = sc.nextInt();

    while (true) {
      System.out.print("> ");

      int a = sc.nextInt();
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
}
