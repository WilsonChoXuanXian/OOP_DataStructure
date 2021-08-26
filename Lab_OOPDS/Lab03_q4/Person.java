package Lab_OOPDS.Lab03_q4;

public class Person {
    private String name;
    private Person spouse;

    public Person () {}

    public Person (String name) {
        this.name = name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setSpouse (Person spouse) {
        this.spouse = spouse;
    }

    public String toString() {
        if (spouse == null)
            return "Name = " + name + ", spouse = none";
        else
            return "Name = " + name + ", spouse = " + spouse.name;
    }
}

/* -------------------------Below are the tutor's solution---------------------

public class Person {
    private String name;
    private Person spouse;

    public Person () {}

    public Person (String name) {
        this.name = name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setSpouse (Person spouse) {
        this.spouse = spouse;
    }

    public String toString() {
        String spouseName;
        if (spouse == null)
            spouseName = "none";
        else
            spouseName = spouse.name;
        return "Name = " + name + ", spouse = " + spousename;
    }
}
*/