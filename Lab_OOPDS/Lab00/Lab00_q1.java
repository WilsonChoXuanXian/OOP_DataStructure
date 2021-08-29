package Lab_OOPDS.Lab00;

import java.util.Scanner;
import java.util.Arrays;

public class Lab00_q1 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter total number of items: ");
        int size = input.nextInt();

        double[] prices = new double[size];
        System.out.print("Enter the prices for " + size + " items: ");
        for (int i = 0; i < prices.length; i++ )
            prices[i] = input.nextDouble();

        System.out.println("The prices : " + Arrays.toString(prices));  // use "Arrays.toString()" for shorter version of the below commented

        // System.out.print("The prices: ");
        // for (int i = 0; i < prices.length; i++)
        //     System.out.print(prices[i] + " ");
        // System.out.println();

        double sum = 0;
        for (int i = 0; i < prices.length; i++)
            sum += prices[i];
        
        System.out.print("Sum of all items: " + sum);
    }
}
