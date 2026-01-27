class Account {
    double calculateInterest(double amount) {
        return 0;

    }
}

class SavingsAccount extends Account {
    double calculateInterest(double amount) {
        return amount * 0.04;
    }

}

class CurrentAccount extends Account {
    double calculateInterest(double amount) {
        return amount * 0.02;
    }
}

class FixedDepositAccount extends Account {
    double calculateInterest(double amount) {
        return amount * 0.07;

    }
}

public class bankingsytem {
    public static void main(String[] args) {
        Account s = new SavingsAccount();
        Account c = new CurrentAccount();
        Account f = new FixedDepositAccount();

        System.out.println("Savings Interest: " + s.calculateInterest(10000));
        System.out.println("Current Interest: " + c.calculateInterest(10000));
        System.out.println("FD Interest: " + f.calculateInterest(10000));

    }

}
