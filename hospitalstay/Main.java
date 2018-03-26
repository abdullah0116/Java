import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    HospitalStay hospitalStay = new HospitalStay();

      while (true) {
        hospitalStay.hosptialStayAPP();
        Scanner sc = new Scanner(System.in);
        String contiune;
        System.out.print("Would you like to add another patient? yes or no: ");
        contiune = sc.next();
        if (contiune.equals("yes")) {
          System.out.println("");
        } else {
          System.out.println("goodbye");
          break;
        }
      }
    }
  }
