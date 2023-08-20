class TestBankAccount {
    public static void main(String[] args) {
        // Create and test BankAccount methods here
        BankAccount account1 = new BankAccount();
        System.out.println("Account 1 - Account Number: " + account1.getAccountNumber());

        account1.deposit(1000, "checking");
        account1.deposit(2000, "savings");
        account1.withdraw(500, "checking");

        System.out.println("Account 1 - Checking Balance: $" + account1.getCheckingBalance());
        System.out.println("Account 1 - Savings Balance: $" + account1.getSavingsBalance());
        account1.displayTotal();

        BankAccount account2 = new BankAccount();
        System.out.println("Account 2 - Account Number: " + account2.getAccountNumber());

        account2.deposit(1500, "checking");
        account2.withdraw(2000, "savings");

        System.out.println("Account 2 - Checking Balance: $" + account2.getCheckingBalance());
        System.out.println("Account 2 - Savings Balance: $" + account2.getSavingsBalance());
        account2.displayTotal();

        System.out.println("Total number of accounts: " + BankAccount.getNumAccounts());
    }
}
