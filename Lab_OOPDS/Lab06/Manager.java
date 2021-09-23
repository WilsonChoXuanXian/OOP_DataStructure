package Lab_OOPDS.Lab06;

public class Manager extends Staff {
    protected double allowance;
    public Manager() {}
    public Manager(String name, double salary, double allowance) {
        super(name, salary);
        this.allowance = allowance;
    }
    public double getPaid() {
        return getSalary() + allowance;
    }
    public String toString() {
        return getClass().getName() + ": name = " + getName() +
               ", salary = " + getSalary() +
               ", allowance = " + allowance +
               ", paid = " + getPaid();
    }
}
