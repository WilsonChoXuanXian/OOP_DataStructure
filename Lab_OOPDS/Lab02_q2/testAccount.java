package Lab_OOPDS.Lab02_q2;

import java.util.ArrayList;
import java.util.Scanner;

public class testAccount {
    public static void main (String[] args) {
        ArrayList<Account> accountArrayList = new ArrayList<>();

        Account account1 = new Account(101,1000);
        accountArrayList.add(account1);

        Account account2 = new Account(102,2000);
        accountArrayList.add(account2);

        Account account3 = new Account(103,3000);
        accountArrayList.add(account3);

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

        System.out.print("Enter amount to deposit = RM");
        userWithdrawAmount = input.nextDouble();
        account1.withdraw(userWithdrawAmount);
        System.out.println("Balance            = RM" + account1.getBalance());
    }
}
