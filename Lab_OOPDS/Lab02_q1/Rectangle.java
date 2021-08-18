package Lab_OOPDS.Lab02_q1;

public class Rectangle {
    private double width;
    private double height;
    private static int numberOfRectangles;

    public Rectangle(){
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        numberOfRectangles += 1;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public static int getNumberOfRectangles() {
        return numberOfRectangles;
    }

    public double getArea() {
        return width * height;
    }

    public void setWidth(double width) {
        if (width <= 0)
            System.out.println("Error : Width must be a positive number.");
        else
            this.width = width;
    }

    public void setHeight(double height) {
        if (height <= 0)
            System.out.println("Error : Height must be a positive number.");
        else
            this.height = height;
    }
}
