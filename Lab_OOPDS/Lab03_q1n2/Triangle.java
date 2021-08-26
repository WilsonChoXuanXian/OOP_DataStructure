package Lab_OOPDS.Lab03_q1n2;

public class Triangle {
    private Point[] points = new Point[3];
    private double perimeter;

    public Triangle() {
        for (int i = 0; i < points.length; i++)
            points[i] = new Point(0,0);
    }

    public Triangle(Point p1, Point p2, Point p3) {
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        calcPerimeter();
    }

    private void calcPerimeter() {
        double distance_p1_p2 = points[0].distance(points[1]);
        double distance_p2_p3 = points[1].distance(points[2]);
        double distance_p1_p3 = points[2].distance(points[0]);

        perimeter = distance_p1_p2 + distance_p2_p3 + distance_p1_p3;
    }

    public String toString() {
        return "Points = " + points[0] + " " + 
                             points[1] + " " + 
                             points[2] + ". Perimeter = " + perimeter;
    }
}

/* -------------------------Below are the tutor's solution---------------------

public class Triangle {
    private Point[] points = new Point[3];
    private double perimeter;

    public Triangle() {
        for (int i = 0; i < points.length; i++)
            points[i] = new Point();
    }

    public Triangle(Point p1, Point p2, Point p3) {
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        calcPerimeter();
    }

    private void calcPerimeter() {
        double d1 = points[0].distance(points[1]);
        double d2 = points[1].distance(points[2]);
        double d3 = points[2].distance(points[0]);

        perimeter = d1 + d2 + d3;
    }

    public String toString() {
        return "Points = " + points[0] + " " + 
                             points[1] + " " + 
                             points[2] + ". Perimeter = " + perimeter;
    }
} 
*/