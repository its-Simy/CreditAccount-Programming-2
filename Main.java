//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DebitAccount d1 = new DebitAccount("A-000-002","Me",5000.0);
        d1.deposit(+500);
        d1.withdraw(100);

        System.out.println();

        CreditAccount c1 = new CreditAccount("A-100-000", "Simon", 1000, 100 );
        c1.Deposit(100);
        c1.Withdraw(500);




    }
}
