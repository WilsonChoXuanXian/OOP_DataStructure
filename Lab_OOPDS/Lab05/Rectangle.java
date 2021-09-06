package Lab_OOPDS.Lab05;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {
    private double width = 1, height = 1;
    public Rectangle() { }
    public Rectangle(double width, double height) {
        setWidth (width);
        setHeight (height);
    }
    public void setWidth (double width) {
        if(width < 0) {
            throw new IllegalArgumentException("Width must be positve.");
        }
        else
            this.width = width;
    }
    public void setHeight (double height) {
        if(height < 0) {
            throw new IllegalArgumentException("Height must be positve.");
        }
        else
            this.height = height;
    }
    public double getArea() {
        return width * height;
    }
}

class TestRectangle {
    public static void main (String[] args) {
        ArrayList<Rectangle> list = new ArrayList<>();
        double width, height;
        do {
            Scanner input = new Scanner(System.in);
            try{
                System.out.print ("Enter width & height: ");
                width = input.nextDouble();
                if (width == 0)
                    break;
                height = input.nextDouble();
                if (width == 0)
                    break;

                list.add (new Rectangle(width, height));
            } 
            catch (IllegalArgumentException ex) {
                System.out.println("Input Error: " + ex.getMessage());
            }
            catch (InputMismatchException ex) {
                System.out.println("Input Error: 2 positive numbers are required.");
            }
        }
        while (true);

        System.out.println ("Area of rectangles:");
        for (int i = 0; i < list.size(); i++)
            System.out.println (i + " " + list.get(i).getArea());
    }
}
