package Lab_OOPDS.Lab02_q2;

public class Account {
    private int id;
    private double balance;
    private java.util.Date dateCreated;

    public Account() {
        this(0,0);
    }

    public Account(int id, double balance) {
        if(balance < 100)
            balance = 100;
        this.id = id;
        this.balance = balance;
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

    public void withdraw(double withdrawAmmount) {
        if (balance > withdrawAmmount)
            balance -= withdrawAmmount;
        else
            System.out.println("Error: Insufficient balance");
    }

    public void deposit(double depositAmmount) {
        balance += depositAmmount;
    }
}
