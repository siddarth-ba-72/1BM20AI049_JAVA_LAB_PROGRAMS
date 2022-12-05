class BankAccount {
   String ownerName;
   double accNo;
   double balanceAmt;
   
   BankAccount(String ownerName, double accNo, double balanceAmt) {
      this.ownerName = ownerName;
      this.accNo = accNo;
      this.balanceAmt = balanceAmt;
   }
   
   public String getName() {
      return this.ownerName;
   }
   
   public double getAccNo() {
      return this.accNo;
   }
   
   public double getBalance() {
      return this.balanceAmt;
   }
   
   public void deposit(double amount) {
      this.balanceAmt += amount;
      System.out.println("Balance amount: " + this.getBalance());
   }
   
   public void withdraw(double amount) {
      if(this.balanceAmt >= amount)
         this.balanceAmt -= amount;
      else
         System.out.println("Not enough balance!");
      System.out.println("Balance amount: " + this.getBalance());
   }
}

public class BankDesc {
   public static void main(String[] args) {
      BankAccount bacc = new BankAccount("Siddarth", 72, 0);
      System.out.println("Bank owner name: " + bacc.getName());
      System.out.println("Acc no: " + bacc.getAccNo());
      System.out.println("Balance amount: " + bacc.getBalance());
      System.out.println();

      bacc.withdraw(1000);
      System.out.println();

      bacc.deposit(50000);
      System.out.println();

      bacc.withdraw(5200);
      System.out.println();
   }
}