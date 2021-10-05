package Lab_OOPDS.Lab06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestStaff2 {
    public static void main (String[] args) {
        Staff[] staffArray = { new Technician ("Ali", 2000, 1200),
                               new Manager ("Siti", 4000, 800), 
                               new Technician ("Abu", 2500, 1000) };

        // Create an ArrayList from staffArray.
        ArrayList<Staff> staffList = new ArrayList<>(Arrays.asList(staffArray));

        // 1. Add code to sort staffArray.
        Arrays.sort(staffArray);

        System.out.println("Array:");
        for (Staff s: staffArray)
            System.out.println(s);
        
        // 2. Add code to sort and print staffList.
        Collections.sort(staffList);

        System.out.println("\nList:");
        for (Staff s: staffList)
            System.out.println(s);
    }
}
