package Lab_OOPDS.Lab06;

public class Technician extends Staff{
    protected double overtimePay;
    public Technician() {}
    public Technician(String name, double salary, double overtimePay) {
        super(name, salary);
        this.overtimePay = overtimePay;
    }
    public double getPaid() {
        return getSalary() + overtimePay;
    }
    public String toString() {
        return getClass().getName() + ": name = " + getName() +
               ", salary = " + getSalary() +
               ", overtime pay = " + overtimePay +
               ", paid = " + getPaid();
    }
}
