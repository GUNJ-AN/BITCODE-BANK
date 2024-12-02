public class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, String accountHolderName, String contactNumber, double initialBalance) {
        super(accountNumber, accountHolderName, contactNumber, initialBalance);
    }

    @Override
    public void applyInterest() {
        System.out.println("No interest on Current Accounts.");
    }
}
