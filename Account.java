import java.util.ArrayList;
import java.util.List;


abstract class Account {
        protected String accountNumber;
        protected String accountHolderName;
        protected String contactNumber;
        protected double balance;
        protected List<String> transactions;

        public Account(String accountNumber, String accountHolderName, String contactNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.contactNumber = contactNumber;
            this.balance = initialBalance;
            this.transactions = new ArrayList<>();
            transactions.add("Account created with initial balance: " + initialBalance);
        }
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                transactions.add("Deposited: " + amount + ", New Balance: " + balance);
                System.out.println("Deposit successful! New balance: " + balance);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                transactions.add("Withdrew: " + amount + ", New Balance: " + balance);
                System.out.println("Withdrawal successful! New balance: " + balance);
            } else {
                System.out.println("Invalid withdrawal amount or insufficient funds.");
            }
        }

        public void transfer(Account targetAccount, double amount) {
            if (amount > 0 && amount <= balance) {
                this.withdraw(amount);
                targetAccount.deposit(amount);
                transactions.add("Transferred: " + amount + " to " + targetAccount.accountNumber);
                targetAccount.transactions.add("Received: " + amount + " from " + this.accountNumber);
                System.out.println("Transfer successful!");
            } else {
                System.out.println("Transfer failed due to insufficient balance or invalid amount.");
            }
        }

        public void viewStatement() {
            System.out.println("Account Statement for " + accountHolderName + " (" + accountNumber + "):");
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }

        public abstract void applyInterest();

    }



