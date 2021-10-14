package Lab_OOPDS.Lab09;

import java.util.*;

public class Lab9_q1 {
    public static void main(String[] args) {
        TreeSet<Integer> sortedSet = new TreeSet<>();
        LinkedHashSet<Integer> insertionSet = new LinkedHashSet<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers: ");
        String inpuString = input.nextLine();

        Scanner scan = new Scanner(inpuString);
        while (scan.hasNextInt()) {
            int number = scan.nextInt();
            sortedSet.add(number);
            insertionSet.add(number);
        }

        System.out.print("Nonduplicate numbers in ascending order: ");
        for (int number : sortedSet)
            System.out.print(number + " ");

        System.out.print("\nNonduplicate numbers in insertion order: ");
        for (int number : insertionSet)
            System.out.print(number + " ");
    }
}
