import java.util.Scanner;

public class Userinput {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstname = input.next();            // read a string
        System.out.print("Enter last name: ");
        String lastname = input.nextLine();         // read a line of string
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();              // read an integer
        System.out.print("Enter a double: ");
        double adouble = input.nextDouble();        // read a double

        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(integer);
        System.out.println(adouble);
    }
}
