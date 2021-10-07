package Lab_OOPDS.Lab07;

import java.util.ArrayList;
import java.util.Scanner;

public class E2 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        System.out.print("Enter integers (0 to end) : ");
        int number = input.nextInt();
        while (number != 0) {
            intList.add(number);
            number = input.nextInt();
        }
        System.out.println("intList : " + intList);
        intList = removeDuplicates(intList);
        System.out.println("After removing duplicates : " + intList);

        ArrayList<String> strList = new ArrayList<>();
        System.out.print("\nEnter strings (0 to end) : ");
        String string = input.next();
        while (!string.equals("0") ) {
            strList.add(string);
            string = input.next();
        }
        System.out.println("strList : " + strList);
        strList = removeDuplicates(strList);
        System.out.println("After removing duplicates : " + strList);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        for (E value: list) {
            if (!result.contains(value))
                result.add(value);
        }
        return result;
    }
}
