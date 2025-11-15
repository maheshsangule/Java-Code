package exceptions.customexceptions;

public class Test {

    public static void main(String[] args) {

        double amount=1000000;
        double balance=12000;

        try {
            BankAccount bankAccount = new BankAccount(balance);
            System.out.println(bankAccount.withdraw(amount));
        } catch (InsufficientFundsException e) {
            System.out.println(e.toString());
        }
    }
}
