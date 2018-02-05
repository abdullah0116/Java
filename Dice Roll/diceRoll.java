import java.util.Random;

public class diceRoll{
  public void DiceRollGame(){

  Random randomRoll = new Random();
  int rollOne = 1 + randomRoll.nextInt(6);
  int rollTwo = 1 + randomRoll.nextInt(6);
  int total = rollOne + rollTwo;

  System.out.println("Roll #1 " + rollOne);
  System.out.println("Roll #2 " + rollTwo);
  System.out.println("The total is " + total + " !");
  }
}
