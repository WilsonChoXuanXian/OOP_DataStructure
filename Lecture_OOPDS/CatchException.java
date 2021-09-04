package Lecture_OOPDS;

public class CatchException {
    public static void main(String[] args) {
        try {
            method1();
            System.out.println("method1 is called");
        } catch(Exception ex) {
            System.out.println("main method");
        }
        System.out.println("main method after try catch block");
    }

    public static void method1() {
        try {
            method2();
        } catch(ArithmeticException ex) {
            System.out.println("method1");
        }
        System.out.println("method1 after try catch block");
    }

    public static void method2() {
        try {
            method3();
        } catch(NullPointerException ex) {
            System.out.println("method2");
        }
        System.out.println("see if this line will be printed out");
    }

    public static void method3() {
        throw new ArithmeticException("error");
    }
}
