package Lecture_OOPDS;

public class TestStatic {
    public static void main(String[] args){
        great();
        // as same as
        // TestStatic.great();

        TestStatic t = new TestStatic();
        t.eat();
    }

    // static method do not need a TestStatic object to invoke
    public static void great(){
        System.out.println("Good morning");
    }
    // instance object need a TestStatuc object to invoke
    public void eat(){
        System.out.println("Having breakfast");
    }

}
