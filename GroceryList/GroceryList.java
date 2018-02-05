import java.util.ArrayList;
import java.util.Scanner;
public class GroceryList {
  public static void main(String[] args) {
    //create an arraylist
    ArrayList<String> grocerys = new ArrayList<String>(5);
    Scanner sc = new Scanner(System.in);
   //print out how many items in the list

    while (true) {
      System.out.println("You have "+ grocerys.size() +" items in your grocery list.");
      System.out.print("Would you like to add an item? [y/n]: ");
      String userInput = sc.next();

      if (userInput.equals("y")) {
        System.out.print("What is the item: ");
        String addItem = sc.next();
        grocerys.add(addItem);
        System.out.println("");
        //System.out.println("You have "+ grocerys.size() +" items in your grocery list.");

      } else if (userInput.equals("n")){
        System.out.println("");
        System.out.println("Here is your grocery list:");
        System.out.println("- " + grocerys.get(0));
        System.out.println("- " + grocerys.get(1));
        System.out.println("- " + grocerys.get(2));
        System.out.println("");
        System.out.println("Goodbye.");
        break;
      } else {
        System.out.println("Sorry i cant read what you just entered!");
        break;
      }
    }
  }
}
