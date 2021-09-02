package Lab_OOPDS.Lab04;

public class Person {
    private String name = "Cho";

    Person () {}

    Person (String name) {
        this.name = name;
    }
    
    public String getName() {
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
        return "Class name: Student , Student's name = " + getName() +", Student ID = " + studentID;
    }
}

class Staff extends Person {
    private double salary = 13579.99;

    Staff () {}

    Staff(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Class name: Staff , Staff's name = " + getName() + ", Staff's salary = " + salary;
    }
}

class Lecturer extends Staff {
    protected String subject = "Computer Science";
    
    Lecturer () {}

    Lecturer (String name, double salary, String subject) {
        super (name, salary);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Class name: Lecturer , Lecturer's name = " + getName() + 
               ", Lecturer's salary = " + getSalary() + 
               ", subject = " + subject;
    }
}

/* public class Person {
    protected String name = "Cho";

    Person () {}

    Person (String name) {
        this.name = name;
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

    Staff () {}

    Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Class name: Staff , Staff's name = " + name + ", Staff's salary = " + salary;
    }
}

class Lecturer extends Staff {
    protected String subject = "Computer Science";
    
    Lecturer () {}

    Lecturer (String name, double salary, String subject) {
        this.name = name;
        this.salary = salary;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Class name: Lecturer , Lecturer's name = " + name + 
               ", Lecturer's salary = " + salary + 
               ", subject = " + subject;
    }
} */

class testProgram {
    public static void main (String[] args) {
        // exersice 1.1
        Person person = new Person("Ali");
        System.out.println(person);

        Student student = new Student("Abu", 120130);
        System.out.println(student);

        Staff staff = new Staff("AhGao", 3089.10);
        System.out.println(staff);

        Lecturer lecturer = new Lecturer("Muthu", 2089.10, "Data Science");
        System.out.println(lecturer);

        System.out.println(); System.out.println();

        // exersice 1.2
        Person[] persons = { new Person("Ali"),
                             new Student("Abu", 120130),
                             new Staff("AhGao", 3089.10),
                             new Lecturer("Muthu", 2089.10, "Data Science")
                           };
        for (Person obj : persons)
            System.out.println(obj);

        System.out.println(); System.out.println();

        // another solution for exercise 1.2
        invoke(new Person("Ali"));
        invoke(new Student("Abu", 120130));
        invoke(new Staff("AhGao", 3089.10));
        invoke(new Lecturer("Muthu", 2089.10, "Data Science"));
    }

    public static void invoke(Person p) {
        System.out.println(p);
    }
}