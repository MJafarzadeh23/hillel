package home.work12.CustomBankAccount;

public class LimitExceededException extends Exception {

    private int limitAmount;

    LimitExceededException(String message, int limitAmount) {
        super(message);
        this.limitAmount = limitAmount;
    }

    public int getLimitAmount() {
        return this.limitAmount;
    }
}
