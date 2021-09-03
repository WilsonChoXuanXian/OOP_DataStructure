package Lecture_OOPDS;

public class StaticAndNonStatic {
    public static void main (String[] args) {
        AAA a1 = new AAA(1);
        AAA a2 = new AAA(2);
        System.out.println(a1);
    }
}

class AAA {
    int a;
    static int b;
    AAA(int c) {
        a = b = c;
    }
    public String toString() {
        return a + " " + b;
    }
}