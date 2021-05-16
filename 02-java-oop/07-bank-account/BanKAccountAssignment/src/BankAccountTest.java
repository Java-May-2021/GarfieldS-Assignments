public class BankAccountTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to The World Bank");
        System.out.println("Remeber 0 for Checking and 1 For Savings");

        BankAccount Simms = new BankAccount();

        System.out.println(Simms.getAccountNumber());

        Simms.Deposit(0, 100);
        Simms.Deposit(1, 50);

        Simms.Withdraw(0, 200);
        Simms.Withdraw(1, 25);

        Simms.Summary();

        BankAccount.getNumberOfAccounts();
        BankAccount.getTotalMoney();
    }
}
