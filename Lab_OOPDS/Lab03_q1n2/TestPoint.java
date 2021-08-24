package Lab_OOPDS.Lab03_q1n2;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x and y: ");
        int x = input.nextInt();
        int y = input.nextInt();
        Point p = new Point(x,y);

        System.out.print("Enter x and y: ");
        x = input.nextInt();
        y = input.nextInt();
        Point q = new Point(x,y);

        System.out.print("2 points : " + p.toString());
        System.out.println(" " + q.toString());

        System.out.print("Distance = " + p.distance(q));
    }
}
