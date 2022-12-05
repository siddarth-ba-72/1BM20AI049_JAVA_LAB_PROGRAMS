class BankAccount {
   String ownerName;
   double accNo;
   double balanceAmt;
   
   BankAccount(String ownerName, double accNo, double balanceAmt) {
      this.ownerName = ownerName;
      this.accNo = accNo;
      this.balanceAmt = balanceAmt;
   }
   
   public void getName() {
      return this.ownerName;
   }
   
   public void getAccNo() {
      return this.accNo;
   }
   
   public void getBalance() {
      return this.balanceAmt;
   }
   
   public void deposit(double amount) {
      this.balanceAmt += amount;
   }
   
   public void deposit(double amount) {
      if(this.balanceAmt >= amount)
         this.balanceAmt -= amount;
   }
}

public class BankDesc {}