import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        // Add test accounts
        bank.addAccount(new SavingsAccount("001", "Guntlet", "1234567890", 5000, 3.5));
        bank.addAccount(new CurrentAccount("002", "Saartha", "9876543210", 10000));

        while (true) {
            System.out.println("\n--- BitCode Student Bank ---");
            System.out.println("1. Add Account");
            System.out.println("2. Remove Account");
            System.out.println("3. Update Account");
            System.out.println("4. Search Account");
            System.out.println("5. Deposit");
            System.out.println("6. Withdraw");
            System.out.println("7. Transfer");
            System.out.println("8. Apply Interest");
            System.out.println("9. View All Accounts");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {  }
                case 2 -> {  }
                case 10 -> {
                    System.out.println("Thank you for using BitCode Student Bank!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}