public class Credit {

    protected int balance;

    Credit() {
        this.balance = 0;
    }

    public void Deposit(int amountAdded) {
        balance += amountAdded;
    }

    public void Withdraw(int amountTaken) {
        balance -= amountTaken;
    }

    public void AccountBalance() {
        System.out.println("Your Credit balance is: " + this.balance);
    }
}