package Lecture_OOPDS;

import java.util.Arrays;
import java.util.Random;

public class TestArray {
  public static void main (String[] args) {

    // int[] mylist = {2, 1, 3, 4, 5};    // this is another way of initialising Arrays

    int[] myList = new int[5];
    Random r = new Random();
    for (int i = 0; i < myList.length; i++)
      myList[i] = r.nextInt(100);
    System.out.println (Arrays.toString(myList));
    Arrays.sort(myList);
    System.out.println (Arrays.toString(myList));
  }
}
