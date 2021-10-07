package Lab_OOPDS.Lab07;

import java.util.Arrays;
import java.util.Scanner;

public class E3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        Integer[] intArray = {64, 51, 39, 87, 31, 57};
        System.out.println("intArray : " + Arrays.toString(intArray));

        System.out.print("Enter a target to search : ");
        Integer target = input.nextInt();
        int index = linearSearch(intArray, target);

        if (index < 0)
            System.out.println("Target not found");
        else
            System.out.println("Target is found at index " + index);

        String[] strArray = {"abstract", "final", "private", "protected", "super"};
        System.out.println("strArray : " + Arrays.toString(strArray));

        System.out.print("Enter a target to search : ");
        String strTarget = input.next();
        index = linearSearch(strArray, strTarget);

        if (index < 0)
            System.out.println("Target not found");
        else
            System.out.println("Target is found at index " + index);

    }

    public static <E> int linearSearch (E[] list, E key) {
        for (int i = 0; i < list.length; i++)
            if (list[i].equals(key))
                return i;
            return -1;
    }
}
