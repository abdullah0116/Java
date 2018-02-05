import java.util.Random;

public class magic8Ball{
  public void Magic8BallGame(){
    Random randomBall = new Random(); //instances of random
    int ballSays = 1 + randomBall.nextInt(19); //setting random numbers between 1 and 20 so i //can use it in randomBall to create the reply from the ball


    if (ballSays == 1) {//checking if the random number we created in ballSays is going to be equal to 1
      System.out.println("MAGIC 8-BALL SAYS: Yes definitely");
    }

    if (ballSays == 2) {
      System.out.println("MAGIC 8-BALL SAYS: My sources say no");
    }

    if (ballSays == 3) {
      System.out.println("MAGIC 8-BALL SAYS: Ask again later");
    }

    if (ballSays == 4) {
      System.out.println("MAGIC 8-BALL SAYS: It is certain");
    }

    if (ballSays == 5) {
      System.out.println("MAGIC 8-BALL SAYS: Most likely");
    }

    if (ballSays == 6) {
      System.out.println("MAGIC 8-BALL SAYS: Yes");
    }

    if (ballSays == 7) {
      System.out.println("MAGIC 8-BALL SAYS: Very doubtful");
    }

    if (ballSays == 8) {
      System.out.println("MAGIC 8-BALL SAYS: Concentrate and ask again");
    }

    if (ballSays == 9) {
      System.out.println("MAGIC 8-BALL SAYS: Signs point to yes");
    }

    if (ballSays == 10) {
      System.out.println("MAGIC 8-BALL SAYS: You may rely on it");
    }

    if (ballSays == 11) {
      System.out.println("MAGIC 8-BALL SAYS: Outlook not so good");
    }

    if (ballSays == 12) {
      System.out.println("MAGIC 8-BALL SAYS: Cannot predict now");
    }

    if (ballSays == 13) {
      System.out.println("MAGIC 8-BALL SAYS: My sources say no");
    }

    if (ballSays == 14) {
      System.out.println("MAGIC 8-BALL SAYS: Better not tell you now");
    }

    if (ballSays == 15) {
      System.out.println("MAGIC 8-BALL SAYS: Outlook good");
    }

    if (ballSays == 16) {
      System.out.println("MAGIC 8-BALL SAYS: Without a doubt");
    }

    if (ballSays == 17) {
      System.out.println("MAGIC 8-BALL SAYS: My reply is no");
    }

    if (ballSays == 18) {
      System.out.println("MAGIC 8-BALL SAYS: Most likely");
    }

    if (ballSays == 19) {
      System.out.println("MAGIC 8-BALL SAYS:  Don't count on it");
    }

    if (ballSays == 20) {
      System.out.println("MAGIC 8-BALL SAYS: Reply hazy try again");
    }
  }
}


//else if (ballSays != 1 ) {
  //System.out.println("MAGIC 8-BALL SAYS: Error!");
//}
