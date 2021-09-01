package Lab_OOPDS.Lab04;

public class Person {
    private String name = "Cho";

    Person () {}

    Person (String name) {
        this.name = name;
    }
    
    public String getname() {
        return name;
    }

    @Override
    public String toString() {
        return "Class name: Person , Person's name = " + name;
    }
}

class Student extends Person {
    private int studentID = 2646;

    Student () {}

    Student (String name, int studentID) {
        super(name);
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Class name: Student , Student's name = " + super.getname() +", Student ID = " + studentID;
    }
}

class Staff extends Person {
    private double salary = 13579.99;
    Staff() {}

    Staff(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Class name: Staff , Staff's name = " + super.getname() + ", Staff's salary = " + salary;
    }
}

class Lecturer extends Staff {
    protected String subjectToTeach = "Computer Science";
    
    Lecturer () {}

    Lecturer (String name, double salary, String subjectToTeach) {
        super (name, salary);
        this.subjectToTeach = subjectToTeach;
    }

    @Override
    public String toString() {
        return "Class name: Lecturer , Lecturer's name = " + super.getname() + 
               ", Lecturer's salary = " + super.getSalary() + 
               ", subject to teach = " + subjectToTeach;
    }
}

/* public class Person {
    protected String name = "Cho";

    Person () {}

    Person (String name) {
        this.name = name;
    }
    
    public String getname() {
        return name;
    }

    @Override
    public String toString() {
        return "Class name: Person , Person's name = " + name;
    }
}

class Student extends Person {
    protected int studentID = 2646;

    Student () {}

    Student (String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Class name: Student , Student's name = " + name +", Student ID = " + studentID;
    }
}

class Staff extends Person {
    protected double salary = 13579.99;
    Staff() {}

    Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Class name: Staff , Staff's name = " + name + ", Staff's salary = " + salary;
    }
}

class Lecturer extends Staff {
    protected String subjectToTeach = "Computer Science";
    
    Lecturer () {}

    Lecturer (String name, double salary, String subjectToTeach) {
        this.name = name;
        this.salary = salary;
        this.subjectToTeach = subjectToTeach;
    }

    @Override
    public String toString() {
        return "Class name: Lecturer , Lecturer's name = " + name + 
               ", Lecturer's salary = " + salary + 
               ", subject to teach = " + subjectToTeach;
    }
} */

class testProgram {
    public static void main (String[] args) {
        // exersice 1.1
        Person person = new Person();
        System.out.println(person.toString());

        Student student = new Student();
        System.out.println(student.toString());

        Staff staff = new Staff();
        System.out.println(staff.toString());

        Lecturer lecturer = new Lecturer();
        System.out.println(lecturer.toString());

        System.out.println(); System.out.println();

        // exersice 1.2
        invoke(new Person("Ali"));
        invoke(new Student("Abu", 120130));
        invoke(new Staff("AhGao", 3089.10));
        invoke(new Lecturer("Muthu", 2089.10, "Data Science"));
    }

    public static void invoke(Person p) {
        System.out.println(p.toString());
    }
}