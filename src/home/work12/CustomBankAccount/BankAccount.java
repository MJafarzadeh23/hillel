package home.work12.CustomBankAccount;

public class BankAccount {
    private int balance = 100;
    private int limit = 500;

    public void depositMoney(int sum) {
        balance += sum;
        System.out.println("You successfully deposited " + sum + " USD. " +
                "\nCurrent balance is " + getBalance());
    }

    public void withdrawMoney(int sum) {
        try{
            if(sum <= getBalance() && sum <= getLimit()) {
                balance -= sum;
                System.out.println("You successfully withdrew " + sum + " USD. " +
                        "\nCurrent balance is " + getBalance());
            } else if(sum > getBalance()) {
                System.out.println("You try to withdraw " + sum);
                throw new InsufficientFundsException("You don't have enough money on your account, " +
                        "available sum is (USD): ", getBalance());
            } else {
                System.out.println("You try to withdraw " + sum);
                throw new LimitExceededException("Requested amount exceeds withdrawal limit. " +
                        "Withdrawal limit is (USD): ", getLimit());
            }
        } catch(InsufficientFundsException e) {
            System.out.println(e.getMessage() + e.getAmount());
            e.printStackTrace();
        } catch (LimitExceededException e) {
            System.out.println(e.getMessage() + e.getLimitAmount());
            e.printStackTrace();
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.depositMoney(100);
        bank.depositMoney(200);
        bank.depositMoney(1000);


        bank.withdrawMoney(150);
        bank.withdrawMoney(600);
        bank.withdrawMoney(300);
        bank.withdrawMoney(2000);
    }
}
