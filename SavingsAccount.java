class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, String contactNumber, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, contactNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest applied: " + interest + ", New Balance: " + balance);
    }
}
