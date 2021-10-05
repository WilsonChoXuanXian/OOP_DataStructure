package Lab_OOPDS.Lab07;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive long integer: ");
        long number = input.nextLong();

        System.out.println("(Iterative) The sum of digits in " + number + " is " + sumDigits(number));
        System.out.println("(Recursive) The sum of digits in " + number + " is " + sumDigitsRecursive(number));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int sumDigitsRecursive(long n) {
        if (n == 0)
            return 0;
        // recursive base case
        else
            return sumDigitsRecursive(n/10) + (int)(n%10);
    }
}
