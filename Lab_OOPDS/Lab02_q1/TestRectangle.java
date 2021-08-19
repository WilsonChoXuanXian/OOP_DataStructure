package Lab_OOPDS.Lab02_q1;

public class TestRectangle {
    public static void main (String[] args) {
        System.out.println("#Rectangle created = " + Rectangle.getNumberOfRectangles());
        System.out.println();

        Rectangle rect1 = new Rectangle();

        System.out.println("rect1: " + "width = " + rect1.getWidth()  +
                                    ", height = " + rect1.getHeight() +
                                      ", area = " + rect1.getArea()    );
        System.out.println();

        rect1.setWidth(-4);
        rect1.setHeight(-7);
        System.out.println("rect1: " + "width = " + rect1.getWidth()  +
                                    ", height = " + rect1.getHeight() +
                                      ", area = " + rect1.getArea()    );
        System.out.println();

        rect1.setWidth(4);
        rect1.setHeight(7);
        System.out.println("rect1: " + "width = " + rect1.getWidth()  +
                                    ", height = " + rect1.getHeight() +
                                      ", area = " + rect1.getArea()    );
        System.out.println();

        Rectangle[] rectangleArray = new Rectangle[5];
        for (int i = 0; i < rectangleArray.length; i++)
          rectangleArray[i] = new Rectangle(i+2, (i+2)*10);

        System.out.println("Rectangle[0]: " + "width = " + rectangleArray[0].getWidth()  +
                                           ", height = " + rectangleArray[0].getHeight() +
                                             ", area = " + rectangleArray[0].getArea()    );

        System.out.println("Rectangle[1]: " + "width = " + rectangleArray[1].getWidth()  +
                                           ", height = " + rectangleArray[1].getHeight() +
                                             ", area = " + rectangleArray[1].getArea()    );

        System.out.println("Rectangle[2]: " + "width = " + rectangleArray[2].getWidth()  +
                                           ", height = " + rectangleArray[2].getHeight() +
                                             ", area = " + rectangleArray[2].getArea()    );

        System.out.println("Rectangle[3]: " + "width = " + rectangleArray[3].getWidth()  +
                                           ", height = " + rectangleArray[3].getHeight() +
                                             ", area = " + rectangleArray[3].getArea()    );
                                    
        System.out.println("Rectangle[4]: " + "width = " + rectangleArray[4].getWidth()  +
                                           ", height = " + rectangleArray[4].getHeight() +
                                             ", area = " + rectangleArray[4].getArea()    );

        System.out.println("#Rectangle created = " + Rectangle.getNumberOfRectangles());
    }
}

/*-------------------------------Below are the tutor's solution---------------------------------------

public class TestRectangle {
    public static void main (String[] args) {
        System.out.println("#Rectangle created = " + 
                        Rectangle.getNumberOfRectangles());
        System.out.println();

        Rectangle rect1 = new Rectangle();

        System.out.println("rect1: " + "width = " + rect1.getWidth()  +
                                    ", height = " + rect1.getHeight() +
                                      ", area = " + rect1.getArea()    );
        System.out.println();

        rect1.setWidth(-4);
        rect1.setHeight(-7);
        System.out.println("rect1: " + "width = " + rect1.getWidth()  +
                                    ", height = " + rect1.getHeight() +
                                      ", area = " + rect1.getArea()    );
        System.out.println();

        rect1.setWidth(4);
        rect1.setHeight(7);
        System.out.println("rect1: " + "width = " + rect1.getWidth()  +
                                    ", height = " + rect1.getHeight() +
                                      ", area = " + rect1.getArea()    );
        System.out.println();

        Rectangle[] rectangleArray = new Rectangle[5];
        for (int i = 0; i < rectangleArray.length; i++)
          rectangleArray[i] = new Rectangle(i+2, (i+2)*10);

        System.out.println("Rectangle[0]: " + "width = " + rectangleArray[0].getWidth()  +
                                           ", height = " + rectangleArray[0].getHeight() +
                                             ", area = " + rectangleArray[0].getArea()    );

        System.out.println("Rectangle[1]: " + "width = " + rectangleArray[1].getWidth()  +
                                           ", height = " + rectangleArray[1].getHeight() +
                                             ", area = " + rectangleArray[1].getArea()    );

        System.out.println("Rectangle[2]: " + "width = " + rectangleArray[2].getWidth()  +
                                           ", height = " + rectangleArray[2].getHeight() +
                                             ", area = " + rectangleArray[2].getArea()    );

        System.out.println("Rectangle[3]: " + "width = " + rectangleArray[3].getWidth()  +
                                           ", height = " + rectangleArray[3].getHeight() +
                                             ", area = " + rectangleArray[3].getArea()    );
                                    
        System.out.println("Rectangle[4]: " + "width = " + rectangleArray[4].getWidth()  +
                                           ", height = " + rectangleArray[4].getHeight() +
                                             ", area = " + rectangleArray[4].getArea()    );

        System.out.println("#Rectangle created = " + Rectangle.getNumberOfRectangles());
    }
}
*/