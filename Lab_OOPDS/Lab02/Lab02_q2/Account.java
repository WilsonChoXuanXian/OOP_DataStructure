package Lab_OOPDS.Lab02.Lab02_q2;

public class Account {
    private int id;
    private double balance;
    private java.util.Date dateCreated;

    public Account() {
        this(0,0);
    }

    public Account(int id, double balance) {
        this.id = id;
        if(balance < 100)
            balance = 100;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double withdrawAmount) {
        if (balance > withdrawAmount)
            balance -= withdrawAmount;
        else
            System.out.println("Error: Insufficient balance");
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }
}

/*-----------------------------Below are the tutor's answer-------------------------------------
import java.util.Date;

public class Account {
    private int id;
    private double balance;

    private Date dateCreated = new Date();

    public Account() {

    }

    public Account(int id, double balance) {
        this.id = id;
        if(balance >= 100)
            this.balance = balance;
        else
            System.out.println("Error: initial balance assigned is insufficient");
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double withdrawAmount) {
        if (balance > withdrawAmount)
            balance -= withdrawAmount;
        else
            System.out.println("Error: Insufficient balance");
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }
}
*/