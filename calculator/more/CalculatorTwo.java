import java.util.Scanner;
import java.lang.Math;

public class CalculatorTwo {
  public static void main(String[] args) {//CalculatorTwoApp
    System.out.print("> ");

    Scanner sc = new Scanner(System.in);

    String user_input = sc.next();

    while (true) {
      System.out.print("> ");
      double a = Double.parseDouble(user_input);
      String op = sc.next();
      double b = sc.nextDouble();

         if (user_input.equals("quit")) {
             System.out.println("Goodbye.");
             break;
          }


            if (op.equals("+")) {
            double total = a + b;
            System.out.println("= " + total);
          } else if (op.equals("-")) {
            double total = a - b;
            System.out.println("= " + total);
          } else if (op.equals("/")) {
            double total  = a / b;
            System.out.println("= " + total);
          } else if (op.equals("*")) {
            double total = a / b;
            System.out.println("= " + total);
          } else if (op.equals("%")) {
            double total = a % b;
            System.out.println("= " + total);
          } else if (op.equals("^")) {
            double total = Math.pow(a,b);
            System.out.println("= " + total);
          } else {
            System.out.println("Error, invalid operator: " + op);
          }
    }
  }
}
  //System.out.println("Ummm I dont recognize this sign, try again! ");
