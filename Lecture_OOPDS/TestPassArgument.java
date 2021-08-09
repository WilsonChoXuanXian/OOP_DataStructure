package Lecture_OOPDS;

public class TestPassArgument {
  public static void main(String[] args) {
    int[] a = {1, 2};
    
    change (a[0]); // pass an int.
    System.out.println("After change: a[0] = " + a[0]); // 1, why?
    
    change (a); // pass an array.
    System.out.println("After change: a[0] = " + a[0]); // 10, why?
  }

  public static void change (int n) {
    n *= 10;
  }
  public static void change (int[] array) {
    array[0] *= 10;
  }
}
