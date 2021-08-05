package Lecture_OOPDS;

import java.util.Scanner;

public class Userinput {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);     // scan user input

        System.out.print("Enter a word: ");
        String word = input.next();            // read a string
        System.out.print("Enter full name: ");
        String fullName = input.nextLine();         // read a line of string
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();              // read an integer
        System.out.print("Enter a double: ");
        double aDouble = input.nextDouble();        // read a double

        System.out.println(word);
        System.out.println(fullName);
        System.out.println(integer);
        System.out.println(aDouble);
    }
}
