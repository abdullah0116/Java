/*
 * This program demonstrates using a predefined method
 * It randomly generates two die values 100 times
 * and counts how many times we roll doubles
 */
package randomnumbers;
import java.util.Random;
/**
 *
 * @author Peggy Fisher
 */
public class RandomNumbers {
    public static void main(String[] args) {
       Random rn = new Random();
       int die1,die2,counter = 0;
       for(int i = 0; i < 100; i++){
         die1 = rn.nextInt(6)+1;
         die2 = rn.nextInt(6)+1;
         
         if(die1 == die2){
         counter++;
         }
       }
       System.out.println("Your dice rolls matched "+counter+" times.");
    }
    
}
