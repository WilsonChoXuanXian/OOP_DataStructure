package Lab_OOPDS.Lab06;

public abstract class Staff implements Comparable<Staff> {
    private String name;
    private double salary;
    public Staff() {}
    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    } 

    public int compareTo (Staff s) {
        if (getPaid() > s.getPaid())
            return 1;
        else if (getPaid() == s.getPaid())
            return 0;
        else 
            return -1;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public abstract double getPaid();
}
