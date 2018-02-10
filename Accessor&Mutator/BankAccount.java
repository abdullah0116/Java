public class BankAccount {
  int accountNumber = 1234;

  String acountHolder = "Abdullah";

  private double balance = 350.75;

  // getter aka access modifer what this code is going to do its going to let us use a private variable and
 // use it in another class

  double getBalance() {
      return balance;
  }

  // this method is to be able to add money to the account from any class that has an instaces of this class
  void setBalance(double amt) {
    balance += amt;
  }

}
