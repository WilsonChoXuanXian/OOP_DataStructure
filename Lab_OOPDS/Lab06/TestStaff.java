package Lab_OOPDS.Lab06;

public class TestStaff {
    public static void main (String[] args) {
        // Staff s = new Staff ("Alex", 1000);
        Staff t = new Technician ("Ali", 2000, 1200);
        System.out.println (t);
        Staff m = new Manager ("Siti", 4000, 1500);
        System.out.println (m);
        }
       
}
