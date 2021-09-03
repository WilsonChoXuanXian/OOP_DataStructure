package Lab_OOPDS.Lab03.Lab03_q4;

public class TestPerson {
    public static void main (String[] args) {
        Person person1 = new Person("Ali");
        Person person2 = new Person("Siti");
        System.out.println(person1);
        System.out.println(person2);

        System.out.println("Ali and Siti get married.");
        person1.setSpouse(person2);
        person2.setSpouse(person1);
        System.out.println(person1);
        System.out.println(person2);

        System.out.println("Change Ali's name to Abu.");
        person1.setName("Abu");
        System.out.println(person1);
        System.out.println(person2);
    }
}
