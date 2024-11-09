import java.util.Scanner;

abstract class Account {
     String customerName;
     String accountNumber;
     double balance;
     String accountType;

    public Account(String customerName, String accountNumber, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void displayBalance();
    public abstract void withdraw(double amount);
}

class SavAcct extends Account {
    private double interestRate;

    public SavAcct(String customerName, String accountNumber, double initialBalance, double interestRate) {
        super(customerName, accountNumber, initialBalance);
        this.accountType = "Savings Account";
        this.interestRate = interestRate;
    }

   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

   
    public void displayBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }

    public void computeAndDepositInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest of " + interest + " added to balance.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class CurAcct extends Account {
     double MIN_BALANCE = 1000;
     double SERVICE_CHARGE = 50;

    public CurAcct(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, initialBalance);
        this.accountType = "Current Account";
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void displayBalance() {
        System.out.println("Current Account Balance: " + balance);
    }

 
    public void withdraw(double amount) {
        if (balance - amount < MIN_BALANCE) {
            System.out.println("Withdrawal would cause balance to fall below minimum. Service charge applied.");
            balance -= SERVICE_CHARGE; // Apply service charge
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }
}

public class Bank1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();
        System.out.print("Choose account type (1 for Savings, 2 for Current): ");
        int accountType = scanner.nextInt();

        Account account;
        if (accountType == 1) {
            System.out.print("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();
            System.out.print("Enter interest rate: ");
            double interestRate = scanner.nextDouble();
            account = new SavAcct(name, accNumber, initialBalance, interestRate);
        } else {
            System.out.print("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();
            account = new CurAcct(name, accNumber, initialBalance);
        }

        boolean running = true;
        while (running) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            if (account instanceof SavAcct) {
                System.out.println("4. Compute and Deposit Interest");
            }
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    if (account instanceof SavAcct) {
                        ((SavAcct) account).computeAndDepositInterest();
                    } else {
                        System.out.println("Option not available for Current Account.");
                    }
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}

