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

        System.out.println("2 points : " + p + " " + q);

        System.out.print("Distance = " + p.distance(q));
    }
}

/* -------------------------Below are the tutor's solution---------------------

public class TestPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;

        System.out.print("Enter x and y: ");
        x = input.nextInt();
        y = input.nextInt();
        Point p1 = new Point(x,y);

        System.out.print("Enter x and y: ");
        x = input.nextInt();
        y = input.nextInt();
        Point p2 = new Point(x,y);

        System.out.println("2 points : " + p1 + " " + p2);
        double distance = p1.distance(p2);
        System.out.print("Distance = " + distance);
    }
} 
*/