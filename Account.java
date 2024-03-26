public class Account {
    private String accountNumber;
    protected  String customerFirstName;
    Account(){
        this.accountNumber = "A-000-001";
        this.customerFirstName = "A Customer";
    }
    Account(String _accountNumber,String _firstName){
        this.accountNumber =_accountNumber;
        this.customerFirstName = _firstName;
    }
    Account(Account account){
        this.accountNumber = account.accountNumber;
        this.customerFirstName = account.customerFirstName;
    }
    public void setaccountNumber(String _accountNumber){
        this.accountNumber = _accountNumber;
    }
    public boolean deposit(double amount){
        return false;
    }
    public boolean withdraw(double amount){
        return false;
    }
}

