import java.util.*;

class Account {
    private int accountno;
    private int balance;

    Account() {
        Random random = new Random();
        int temp = 0;
        for(int i = 0; i < 3; i++) {
            temp += random.nextInt(70);
        }
        this.accountno = temp;
        this.balance = 0;
    }

    void setACcNum(int accountno) {
        this.accountno = accountno;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }

    int getAccNum() {
        return this.accountno;
    }

    int getBalance() {
        return this.balance;
    }
}

class BankApp {
    Account acc;
    BankApp(Account acc) {
        this.acc = acc;
    }

    void withdraw(int amount) {
        if(amount > acc.getBalance()) {
            System.out.println("Insufficient Balance");
        } else {
            acc.setBalance(acc.getBalance() - amount);
        }
    }

    void deposit(int amount) {
        acc.setBalance(acc.getBalance() + amount);
    }

    String printToString() {
        return "Account Number : "+acc.getAccNum()+" "+" having Balance : "+acc.getBalance();
    }
}

public class Q1 {
    public static void main(String[] args) {
        Account a1 = new Account();
        BankApp b1 = new BankApp(a1);
        b1.withdraw(1200);
        System.out.println(b1.printToString());
        b1.deposit(130);
        System.out.println(b1.printToString());
        b1.withdraw(750);
        System.out.println(b1.printToString());
    }
}