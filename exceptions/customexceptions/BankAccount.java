package exceptions.customexceptions;

public class BankAccount {

//    int amount=0;
    double balance;


    public BankAccount(double amount){
        this.balance=amount;
    }

    double withdraw(double amount) throws InsufficientFundsException {
      if(amount>balance){
          throw new InsufficientFundsException(amount);
      }
      else{
         return balance=amount;
      }
    }




}
