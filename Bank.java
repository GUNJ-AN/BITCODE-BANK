import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully!");
    }

    public void removeAccount(String accountNumber) {
        accounts.removeIf(account -> account.accountNumber.equals(accountNumber));
        System.out.println("Account removed successfully!");
    }

    public void updateAccount(String accountNumber, String newName, String newContact) {
        for (Account account : accounts) {
            if (account.accountNumber.equals(accountNumber)) {
                account.accountHolderName = newName;
                account.contactNumber = newContact;
                System.out.println("Account updated successfully!");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void viewAllAccounts(Comparator<Account> comparator) {
        accounts.stream().sorted(comparator).forEach(account -> {
            System.out.println("Account Number: " + account.accountNumber);
            System.out.println("Account Holder: " + account.accountHolderName);
            System.out.println("Contact: " + account.contactNumber);
            System.out.println("Balance: " + account.balance);
            System.out.println("-----------------------");
        });
    }

    public Account searchAccount(String query) {
        for (Account account : accounts) {
            if (account.accountNumber.equals(query) || account.accountHolderName.equalsIgnoreCase(query) || account.contactNumber.equals(query)) {
                return account;
            }
        }
        System.out.println("Account not found.");
        return null;
    }

}