public class ATM {
    private long moneyAmount;
    private long sum;

//    private int banknote;
//    private long banknotesNum;


    public ATM(long moneyAmount, long sum) {
        this.moneyAmount = moneyAmount;
        this.sum = sum;
    }

    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public long getSum() {
        if (sum > moneyAmount) {
            return 0;
        }
        return sum;
    }

    public long setSum(long sum) {
        this.moneyAmount = sum + moneyAmount;

        return moneyAmount;
    }
}
