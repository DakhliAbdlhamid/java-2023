import java.util.Random;

class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numAccounts = 0;
    private static double totalAmountStored = 0;
    private String accountNumber;

    public BankAccount() {
        numAccounts++;
        accountNumber = generateAccountNumber();
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(double amount, String accountType) {
        if (accountType.equals("checking")) {
            checkingBalance += amount;
        } else if (accountType.equals("savings")) {
            savingsBalance += amount;
        }
        totalAmountStored += amount;
    }

    public void withdraw(double amount, String accountType) {
        if (accountType.equals("checking")) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalAmountStored -= amount;
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        } else if (accountType.equals("savings")) {
            if (savingsBalance >= amount) {
                savingsBalance -= amount;
                totalAmountStored -= amount;
            } else {
                System.out.println("Insufficient funds in savings account.");
            }
        }
    }

    public void displayTotal() {
        System.out.println("Total money: $" + totalAmountStored);
    }

    private String generateAccountNumber() {
        Random rand = new Random();
        StringBuilder accountNum = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNum.append(rand.nextInt(10));
        }
        return accountNum.toString();
    }

    public static int getNumAccounts() {
        return numAccounts;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.deposit(1000, "checking");
        account1.deposit(2000, "savings");
        account1.withdraw(500, "checking");
        account1.displayTotal();

        BankAccount account2 = new BankAccount();
        account2.deposit(1500, "checking");
        account2.withdraw(2000, "savings");
        account2.displayTotal();

        System.out.println("Total number of accounts: " + BankAccount.getNumAccounts());
    }
}

class TestBankAccount {
    public static void main(String[] args) {
        // Create and test BankAccount methods here
    }
}
