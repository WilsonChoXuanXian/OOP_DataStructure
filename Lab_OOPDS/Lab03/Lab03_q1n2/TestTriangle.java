package Lab_OOPDS.Lab03.Lab03_q1n2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestTriangle {
    public static void main (String[] args){
        ArrayList<Point> points = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Enter x and y (negative to exit) : ");
            int x = input.nextInt();
            if (x < 0) break;
            int y = input.nextInt();
            if (y < 0) break;

            Point tempPoint = new Point(x,y);
            points.add(tempPoint);
        }

        for(int i = 0; i < points.size(); i++)
            System.out.println("point" + i + " " + points.get(i));
        System.out.println();

        ArrayList<Triangle> triangles = new ArrayList<>();
        int index1, index2, index3;

        while(true) {
        System.out.print("Select 3 indexes to form a triangle (negative to exit): ");
        index1 = input.nextInt();
        if (index1 < 0) break;
        index2 = input.nextInt();
        if (index2 < 0) break;
        index3 = input.nextInt();
        if (index3 < 0) break;

        Triangle tempTriangle = new Triangle(points.get(index1), points.get(index2), points.get(index3));
        triangles.add(tempTriangle);
        }

        for(int i = 0; i < triangles.size(); i++)
            System.out.println("Triangle " + i + ": " + triangles.get(i));
    }
}

/* -------------------------Below are the tutor's solution---------------------

public class TestTriangle {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Point> points = new ArrayList<>();

        int x, y;
        do {
            System.out.print("Enter x and y (negative to exit) : ");
            x = input.nextInt();
            if (x < 0) break;
            y = input.nextInt();
            if (y < 0) break;

            points.add(new Point (x,y));
        } while (true);

        for(int i = 0; i < points.size(); i++)
            System.out.println("point" + i + " " + points.get(i));
        System.out.println();

        ArrayList<Triangle> triangles = new ArrayList<>();
        int index1, index2, index3;

        do {
        System.out.print("Select 3 indexes to form a triangle (negative to exit): ");
        index1 = input.nextInt();
        if (index1 < 0) break;
        index2 = input.nextInt();
        if (index2 < 0) break;
        index3 = input.nextInt();
        if (index3 < 0) break;

        triangles.add(new Triangle(points.get(index1),
                                   points.get(index2),
                                   points.get(index3)));
        } while (true);

        for(int i = 0; i < triangles.size(); i++)
            System.out.println("Triangle " + i + ": " + triangles.get(i));
    }
} 
*/