/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelcost;
import java.util.Scanner;

public class TravelCost {

  public static void main(String[] args) {
    double distance, pricePerGallon, mpg, totalCost;
    Scanner sc = new Scanner(System.in);

    System.out.print("What is your total distance that you are traveling? ");
    distance = sc.nextDouble();

    System.out.print("What is the current price per gallon? ");
    pricePerGallon = sc.nextDouble();

    System.out.print("What is your MPG of your car? ");
    mpg = sc.nextDouble();

    totalCost = distance * pricePerGallon / mpg;

    System.out.println("Heres how much you'll be paying for gas: "+totalCost);
  }
}
