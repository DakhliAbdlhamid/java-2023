public class TestBankAccount {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount bankAccount = new BankAccount(2400.00,1500.00);

        // addMoneyToChecking method
        bankAccount.addtockeking(450.0);

        // addMoneyToSaving method
        bankAccount.addtosavings(500.0);

        // withdrawMoneyFromChecking method
        bankAccount.withdrawmoney(250.0);

        // totalMoney method
        bankAccount.total_money();
        System.out.println(BankAccount.getNumberOfAccounts());
    }
}