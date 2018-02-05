import java.util.Scanner;

public class BankPinGame{
  public boolean yourBankPin() {
    //String greeting = "WELCOME TO THE BANK OF ABDULLAH KAREEM";
    String user_guess;
    System.out.println("ENTER YOUR PIN:") ;


    String bankPin = "0775";

    Scanner sc = new Scanner( System.in );
    user_guess = sc.nextLine();

     if (user_guess.equals(bankPin)) {
        System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        return  true;
     } else {
        System.out.println("INCORRECT PIN. TRY AGAIN.");
        return false;
     }

  }
}
