import java.util.Random;
public class fortuneCookie{
  public void YourFortuneCookie(){
    Random fortune = new Random();
    int fortuneNumber = 1 + fortune.nextInt(10);

    if (fortuneNumber == 1) {
      System.out.println("Fortune cookie says: You will have a great time doing your homework for the Java Class.");
    }

    if (fortuneNumber == 2) {
      System.out.println("Fortune cookie says: Believe it can be done.");
    }

    if (fortuneNumber == 3) {
      System.out.println("Fortune cookie says: Practice, practice, practice. Remember.");
    }

    if (fortuneNumber == 4) {
      System.out.println("Fortune cookie says: A beautiful, smart, and loving person will be coming into your life.");
    }

    if (fortuneNumber == 5) {
      System.out.println("Fortune cookie says: A dubious friend may be an enemy in camouflage.");
    }

    if (fortuneNumber == 6) {
      System.out.println("Fortune cookie says: A faithful friend is a strong defense.");
    }

    if (fortuneNumber == 7) {
      System.out.println("Fortune cookie says: A fresh start will put you on your way.");
    }

    if (fortuneNumber == 8) {
      System.out.println("Fortune cookie says: A friend asks only for your time not your money.");
    }

    if (fortuneNumber == 9) {
      System.out.println("Fortune cookie says: A friend is a present you give yourself.");
    }

    if (fortuneNumber == 10) {
      System.out.println("Fortune cookie says: A good friendship is often more important than a passionate romance.");
    }
  }
}
