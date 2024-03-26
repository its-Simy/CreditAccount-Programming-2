import javax.sound.midi.SysexMessage;

public class DebitAccount extends Account {
    private double Balance;
    DebitAccount(String _AccountNumber, String _CustomerFirstName, double _balance)
    {
        this.customerFirstName = _CustomerFirstName;
        this.setaccountNumber(_AccountNumber);
        this.Balance = _balance;
    }
    public boolean withdraw(double amount){
        if(Balance >= amount && amount >= 0){
            Balance-=amount;
            System.out.println("The transaction completed successfully");
            System.out.println(Balance);
            return  true;
        }
        else {
            System.out.println("Unable to complete the transaction");
            System.out.println(Balance);
            return false;
        }
    }
    public boolean deposit(double amount) {
        if(amount >0) {
            Balance+= amount;
            System.out.println(Balance);
            return true;
        }
        else {
            return false;

        }

    }

}
