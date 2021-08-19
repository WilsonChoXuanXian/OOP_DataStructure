package Lab_OOPDS.Lab02_q2;

import java.util.ArrayList;
import java.util.Scanner;

/* public class testAccount {
    public static void main (String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        Account account1 = new Account(101,1000);
        accounts.add(account1);

        Account account2 = new Account(102,2000);
        accounts.add(account2);

        Account account3 = new Account(103,3000);
        accounts.add(account3);

        System.out.println("Account id = " + account1.getId());
        System.out.println("Created    = " + account1.getDateCreated());
        System.out.println("Balance    = " + account1.getBalance());
        System.out.println();

        System.out.println("Account id = " + account2.getId());
        System.out.println("Created    = " + account2.getDateCreated());
        System.out.println("Balance    = " + account2.getBalance());
        System.out.println();

        System.out.println("Account id = " + account3.getId());
        System.out.println("Created    = " + account3.getDateCreated());
        System.out.println("Balance    = " + account3.getBalance());
        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.println("First Account ID = " + account1.getId());
        System.out.print("Enter amount to deposit = RM");
        double userDepositAmount = input.nextDouble();
        account1.deposit(userDepositAmount);
        System.out.println("Balance            = RM" + account1.getBalance());
        System.out.println();

        System.out.print("Enter amount to withdraw = RM");
        double userWithdrawAmount = input.nextDouble();
        account1.withdraw(userWithdrawAmount);
        System.out.println("Balance            = RM" + account1.getBalance());
        System.out.println();

        System.out.print("Enter amount to withdraw = RM");
        userWithdrawAmount = input.nextDouble();
        account1.withdraw(userWithdrawAmount);
        System.out.println("Balance            = RM" + account1.getBalance());
    }
}
 */
// ------------------------------Below are the tutor's answer---------------------------------

public class testAccount {
    public static void main (String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        for(int i = 0; i < 3; i++)
            accounts.add (new Account(101+i, (i+1)*1000));

        for(int i = 0; i < accounts.size(); i++) {
            System.out.println ("Account id  = " + accounts.get(i).getId());
            System.out.println ("Created     = " + accounts.get(i).getDateCreated());
            System.out.printf ("Balance      = RM%.2f%n", 
                                accounts.get(i).getBalance());
            System.out.println ();
        }

        Scanner input = new Scanner(System.in);
        Account firstAccount = accounts.get(0);
        System.out.println("First Account ID = " + firstAccount.getId());

        System.out.print ("Enter amount to deposit = RM");
        double amount = input.nextDouble();
        firstAccount.deposit(amount);
        System.out.printf ("Balance            = RM%.2f%n%n",
                            firstAccount.getBalance());

        System.out.print ("Enter amount to withdraw = RM");
        amount = input.nextDouble();
        firstAccount.withdraw(amount);
        System.out.printf ("Balance            = RM%.2f%n%n",
                            firstAccount.getBalance());

        System.out.print("Enter amount to withdraw = RM");
        amount = input.nextDouble();
        firstAccount.withdraw(amount);
        System.out.printf ("Balance            = RM%.2f%n%n",
                            firstAccount.getBalance());
    }
}
