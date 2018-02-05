public class main{
   public static void main(String[] args) {
    BankPinGame bank = new BankPinGame();
    System.out.println("WELCOME TO THE BANK OF ABDULLAH KAREEM");
    //bank.yourBankPin();
    for (int i = 0; i < 3; i++) {
      boolean right = bank.yourBankPin();
        if (right) {
          break;
        }

        if (i == 2) {

          break;
        }
        System.out.println("");

    }

  }
}
