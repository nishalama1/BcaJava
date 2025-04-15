package inheritance;

public class SavingAcc extends BankAccount{
    
    @Override
    void withdraw() {
        super.withdraw();
        super.withdraw();
    }
      
}
