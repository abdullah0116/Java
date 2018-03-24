/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;

public class Methods {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y,z;
        
        System.out.print("enter the three numbers that you would like to find "
                + "the average of: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        double avg = average(x,y,z);
        System.out.println("Here is the average for your numbers :"+avg);
        
    }
    
    public static double average(double num1, double num2, double num3) {
           double total = num1 + num2 + num3 / 3;
           return total;
    }
}
