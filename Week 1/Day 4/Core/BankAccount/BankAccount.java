public class BankAccount {
   private double checking_balance;
   private double savings_balance;
   static int numberOfAccounts;
   static int totalAmountOfMoney;
   
   // Constructor
   public BankAccount(double checking_balance, double savings_balance) {
      this.checking_balance = checking_balance;
      this.savings_balance = savings_balance;
      numberOfAccounts++;
   }
   
   //methods
   public void addtockeking(double amount){
    double newcheking=this.checking_balance+amount;
    this.checking_balance=newcheking;
    System.out.println("Your new cheking is" +newcheking);
   }

   public void addtosavings(double amount){
    double newsavings=this.savings_balance+amount;
    this.savings_balance=newsavings;
    System.out.println("Your new savings is" +newsavings);
   }

   public void withdrawmoney(double amount){
    if((this.checking_balance-amount)>=0){
      double newcheking_balance=this.checking_balance-amount;
    this.checking_balance=newcheking_balance;
    System.out.println("Your new checking balance: " + newcheking_balance);
    }
    else{
        System.out.println("You d'ont have enough money to withdraw ");
    }
   }
   public void total_money(){
    double total=this.checking_balance+this.savings_balance;
    System.out.println("Your total money is "+total);
   }





   // Getters
   public double getCheckingBalance() {
      return checking_balance;
   }
   
   public double getSavingsBalance() {
      return savings_balance;
   }
   
   public static int getNumberOfAccounts() {
      return numberOfAccounts;
   }
   
   public static int getTotalAmountOfMoney() {
      return totalAmountOfMoney;
   }
   

}



