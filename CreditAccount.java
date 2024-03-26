
public class CreditAccount extends Account {

    private double creditLimit;
    private double balance;

    CreditAccount(String _AccountNumber, String _CustomerFirstName, double _CreditLimit, double _balance) {

        this.customerFirstName = _CustomerFirstName;
        this.setaccountNumber(_AccountNumber);
        this.setBalance(_balance);
        this.creditLimit = _CreditLimit;

    }

    public Boolean Deposit(int amountAdded) {
        if (this.balance <= 0) {
            this.balance = 0;
            System.out.println("Credit is payed off");
            return false;
        } else if (this.balance < amountAdded) {
            System.out.println("The balance is less than amount you are trying to pay");

            return false;
        } else {
            this.balance = this.balance - amountAdded;
            System.out.println("The transaction completed successfully");
            AccountBalance();
            return true;
        }
    }

    public Boolean Withdraw(int amountTaken) {
            if((this.creditLimit - this.balance) >= amountTaken){
                balance += amountTaken;
                System.out.println("The transaction completed successfully");
                AccountBalance();
                return true;
            }
            else{
                System.out.println("The amount is greater than the remaining balance");
                return false;
            }
    }

    public void AccountBalance() {
        System.out.println("Your Credit balance is: " + this.balance);
    }

    public void setBalance(double _balance){
        this.balance = _balance;
    }

}

