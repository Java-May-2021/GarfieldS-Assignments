import java.util.Random;

public class BankAccount {

    private String AccountNumber;
    private double CheckingBalance;
    private double SavingsBalance;

    private static int NumberOfAccounts;
    private static double TotalMoney;

    private String CreateAccount() {
        Random r = new Random();
        char[] num = "0123456789".toCharArray();
        String AccountNum = "";
        for (int i = 0; i < 10; i++) {
            AccountNum = AccountNum + String.valueOf(num[r.nextInt(10)]);
        }
        return AccountNum;
    }

    // constructors

    public BankAccount() {
        this.AccountNumber = CreateAccount();
        NumberOfAccounts++;
    }

    // getters

    public double getCheckingBalance() {
        return CheckingBalance;
    }

    public double getSavingsBalance() {
        return SavingsBalance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void Deposit(int account, double sum) {
        if (account == 0 || account == 1) {
            if (account == 0) {
                CheckingBalance = CheckingBalance + sum;
                System.out.println("New Checking Balance: " + CheckingBalance);
                TotalMoney = TotalMoney + sum;
            } else {
                SavingsBalance = SavingsBalance + sum;
                System.out.println("New Savings Balance:" + SavingsBalance);
                TotalMoney = TotalMoney + sum;
            }
        } else {// end nested if
            System.out.println("not an valid acount");
        }

    }// end Deposit

    public void Withdraw(int account, double sum) {
        if (account == 0 || account == 1) {
            if (account == 0) {
                if (CheckingBalance - sum <= 0) {
                    System.out.println("not enough cash in account");
                } else {
                    CheckingBalance = CheckingBalance - sum;
                    System.out.println("New Checking Balance: " + CheckingBalance);
                    TotalMoney = TotalMoney - sum;
                }
            } else {
                if (SavingsBalance - sum <= 0) {
                    System.out.println("not enough cash in account");
                } else {
                    SavingsBalance = SavingsBalance - sum;
                    System.out.println("New Savings Balance: " + SavingsBalance);
                    TotalMoney = TotalMoney - sum;
                }
            }
        } else {// end nested if
            System.out.println("not an valid acount");
        }

    }// end Withdraw

    public void Summary() {
        System.out.println("Checking Balance: " + CheckingBalance);
        System.out.println("Savings Balance: " + SavingsBalance);

    }

    // Static Methods

    public static void getNumberOfAccounts() {
        System.out.println(NumberOfAccounts);
    }

    public static void getTotalMoney() {
        System.out.println(TotalMoney);
    }

}
