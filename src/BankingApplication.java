import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {
        //TODO Auto-generated method stud


    }
}





class BankAccount {

    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    void deposit(int amount) {
        if (amount > 0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount; //the minus is there to indicate the withdraw
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0)
        {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0)
        {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else
        {
            System.out.println("No transaction occured");
        }
    }

    void showMenu()
    {

    }
}