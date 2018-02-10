public class Main {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();
    System.out.println("Heres your Account Balance: "  + account.getBalance());

    account.setBalance(45.0);

    System.out.println("Heres your Account Balance: "  + account.getBalance());
  }
}
