/*
 * This program is designed to calculate the exterior surface area of a house
 */
package simplecalculation;
import java.util.Scanner;

public class SimpleCalculation {

    public static void main(String[] args) {
     double houseLength, houseWidth, houseHeight, windowsSize, doorsSize;
     int doorsAmount, windowsAmount;
     
     Scanner sc = new Scanner(System.in);
     System.out.print("What is your house Length: ");
     houseLength = sc.nextDouble();
     
     System.out.print("What is your house Width: ");
     houseWidth = sc.nextDouble();
     
     System.out.print("What is your house Height: ");
     houseHeight = sc.nextDouble();
     
     System.out.print("How many Windows do you have? ");
     windowsAmount = sc.nextInt();
     
     System.out.print("What's the Window sizes: ");
     windowsSize = sc.nextDouble();
     
     System.out.print("How many Doors do you have? ");
     doorsAmount = sc.nextInt();
     
     System.out.print("What's the size of door? ");
     doorsSize = sc.nextInt();
     
     double totalDoors = doorsAmount * doorsSize;
     double totalWindows = windowsAmount * windowsSize;
     double total = houseLength * houseHeight * houseWidth - totalDoors - totalWindows; 
     
     System.out.println("Here's the  total area that you need to paint: " + total);
    }
}
