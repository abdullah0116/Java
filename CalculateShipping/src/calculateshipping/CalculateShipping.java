/*
 * This program uses decision logic to determine shipping costs
 * Shipping rates: 
 * Over $75 free
 * Between $50 and $75 the cost is $5
 * Over $25 but less than $50 is $10
 * Less than $25 is $15
 */
package calculateshipping;
import java.util.Scanner;

public class CalculateShipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price; 
        
        System.out.print("What is the price of the item that you are trying"
                + " to buy: ");
        
        price = sc.nextInt();
        
        if(price > 75) {
            System.out.println("Nice your shipping cost turns out to be nothing"
                    + " You owe $0 for shipping but your total comes to $" +
                    price);
        } else if(price >= 50 && price <= 75) {
            System.out.println("You owe us $5 plus your purchase of $" + price);
        } else if(price >= 25 && price < 50) {
            System.out.println("You owe us $10 plus your purchase of $" + price);
        } else if(price < 25) {
            System.out.println("You owe us $15 plus your purchase of $" + price);
        }
    }
    
}
