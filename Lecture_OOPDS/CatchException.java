package Lecture_OOPDS;

public class CatchException {
    public static void main(String[] args) {
        try {
            System.out.println("main");
            method1();
        } catch(Exception ex) {
            System.out.println("main method's catch");
        } finally {
            System.out.println("main's finally");
        }
        System.out.println("main method after try catch block");
    }

    public static void method1() {
        try {
            System.out.println("method1");
            method2();
        } catch(ArithmeticException ex) {
            System.out.println("method1's catch");
        } finally {
            System.out.println("method1's finally");
        }
        System.out.println("method1 after try catch block");
    }

    public static void method2() {
        try {
            System.out.println("method2");
            method3();
        } catch(NullPointerException ex) {
            System.out.println("method2's catch");
        } finally {
            System.out.println("method2's finally");
        }
        System.out.println("method2 after try catch block");
    }

    public static void method3() {
        System.out.println("method3");
        throw new ArithmeticException("Error");
    }
}
