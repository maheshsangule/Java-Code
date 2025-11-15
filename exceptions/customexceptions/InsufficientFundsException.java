package exceptions.customexceptions;

public class InsufficientFundsException extends Exception{

    private double amount;

    public InsufficientFundsException(double amount) {
       this.amount = amount;
    }

    @Override
    public String toString() {
        return "You don't have enough money";
    }
}


