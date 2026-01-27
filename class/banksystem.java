class BankAccount {
    private int accno;
    private double balance;
    private String actype;

    BankAccount(int accno, double balance, String actype) {
        this.accno = accno;
        this.balance = balance;
        this.actype = actype;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        }
        else{
            System.out.println("Can not perform this operation");
        }
         
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + this.accno);
        System.out.println("Account Type: " + this.actype);
        System.out.println("Account Balance: " + this.balance);
    }
}

public class banksystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(101, 5000.0, "Savings");
        System.out.println("Initial Account Details:");
        account.displayAccountDetails();

        account.deposit(10000);

        account.withdraw(5000);

        // Display final account details
        System.out.println("\nFinal Account Details:");
        account.displayAccountDetails();

    }
}
