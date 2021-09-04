package Lecture_OOPDS;

public class TestStatic {
    public static void main(String[] args){
        System.out.println("In a static method, we can call a static method within the same class straight away without creating a new object");
        great();
        // as same as
        // TestStatic.great();

        System.out.println("In a static method, we must creat a new object when we wanna call a non-static method in the same class");
        TestStatic t = new TestStatic();
        t.eat();
        t.callingBoth();
    }

    // static method do not need a TestStatic object to invoke
    public static void great(){
        System.out.println("TestStatic's static method\n");
    }
    // instance object need a TestStatuc object to invoke
    public void eat(){
        System.out.println("TestStatic's non-static method\n");
    }
    // In a Non-static method, we can straight away call both STATIC & NON-STATIC method
    public void callingBoth() {
        eat();
        great();
    }
}

class Testing {

    public void testing() {
        System.out.println("In another class, we must use ClassName.method() in order to call another class's method");

        TestStatic.great();

        TestStatic t = new TestStatic();
        t.eat();
        t.callingBoth();
    }

    public static void test() {
        System.out.println("In another class, we must use ClassName.method() in order to call another class's method");
        
        TestStatic.great();

        TestStatic t = new TestStatic();
        t.eat();
        t.callingBoth();
    }
}