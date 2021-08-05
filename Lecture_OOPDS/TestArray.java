import java.util.Arrays;
import java.util.Random;

public class TestArray {
  public static void main (String[] args) {
    int[] myList = new int[5];
    Random r = new Random();
    for (int i = 0; i < myList.length; i++)
      myList[i] = r.nextInt(100);
    System.out.println (Arrays.toString(myList));
    Arrays.sort(myList);
    System.out.println (Arrays.toString(myList));
  }
}
