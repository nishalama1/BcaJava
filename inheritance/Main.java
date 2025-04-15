package inheritance;


public class Main {
 public static void main(String[] args){
    BankAccount b= new SavingAcc();
     b.withdraw();
     b.deposit();
 }
}
