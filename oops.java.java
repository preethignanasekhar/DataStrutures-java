import java.util.*;
abstract class BankAcc{
    private String AccHolderName;
    private double balance;
    
     BankAcc(String AccHolderName, double balance){
         this.AccHolderName=AccHolderName;
         this.balance = balance;
     }
     
     public abstract void displayDetails();
     public abstract void currentBalance();
     
     public String getAccHolderName(){
         return AccHolderName;
     }
     
     
    public void setAccHolderName(String AccHolderName){
        this.AccHolderName=AccHolderName;
    }
     
    public double getbalance(){
        return balance;
    } 
    
    public void setbalance(double balance){
        this.balance = balance;
    }

     
     public void deposit(double amount){
         if(amount>0){
             balance +=amount;
             System.out.println("Deposited :" + amount);
         }else{
             System.out.println("Invalid Amount");
         }
     }

     
     public void withdraw(double amount){
         if(amount>0 && amount<=balance){
             balance -=amount;
             System.out.println("Withdrawal Amount :" + amount);
         }else{
             System.out.println("Insufficient amount");
         }
     }
}

class SavingsAcc extends BankAcc{
    public SavingsAcc(String AccHolderName, double balance){
        super(AccHolderName, balance);
    }

    
    public void displayDetails(){
        System.out.println("Savings Account");
        System.out.println("Account Name:" + getAccHolderName());
        System.out.println("Balance:" + getbalance());
    }
    public void currentBalance()
    {
        System.out.println("Final updated balance:"+ getbalance());
    }
   
}

public class Main{
    public static void main(String[] args){
        BankAcc savings = new SavingsAcc("Preethi G",2000);
       
        savings.deposit(2000);
        savings.withdraw(300);
        savings.displayDetails();
        savings.currentBalance();
        
    }
}