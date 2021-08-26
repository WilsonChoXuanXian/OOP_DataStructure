package Lab_OOPDS.Lab03_q1n2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestTriangle {
    public static void main (String[] args){
        ArrayList<Point> points = new ArrayList<>();
        ArrayList<Triangle> triangles = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Enter x and y (negative to exit) : ");
            int x = input.nextInt();
            if (x < 0)
                break;
            int y = input.nextInt();
            Point tempPoint = new Point(x,y);
            points.add(tempPoint);
        }

        for(int i = 0; i < points.size(); i++)
            System.out.println("point" + i + " " + points.get(i));
        System.out.println();

        int index1, index2, index3;

        while(true) {
        System.out.print("Select 3 indexes to form a triangle (negative to exit): ");
        index1 = input.nextInt();
        if (index1 < 0)
            break;
        index2 = input.nextInt();
        index3 = input.nextInt();
        Triangle tempTriangle = new Triangle(points.get(index1), points.get(index2), points.get(index3));
        triangles.add(tempTriangle);
        }

        for(int i = 0; i < triangles.size(); i++)
            System.out.println("Triangle " + i + ": " + triangles.get(i));
    }
}
