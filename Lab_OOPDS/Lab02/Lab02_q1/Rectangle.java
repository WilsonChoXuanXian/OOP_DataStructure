package Lab_OOPDS.Lab02.Lab02_q1;

public class Rectangle {
    private double width;
    private double height;
    private static int numberOfRectangles;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        numberOfRectangles++;
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

/*--------------------------Below are the tutor's solution--------------------------------

public class Rectangle {
    private double width = 1;
    private double height = 1;
    private static int numberOfRectangles = 0;

    public Rectangle() {
        numberOfRectangles++;
    }

    public Rectangle(double w, double h) {
        setWidth (w);
        setHeight (h);
        numberOfRectangles++;
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
        if (width > 0)
            this.width = width;
        else
            System.out.println("Error : Width must be a positive number.");
    }

    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
        else
            System.out.println("Error : Height must be a positive number.");
    }
}
*/