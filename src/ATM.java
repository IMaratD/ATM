public class ATM {
    private long moneyAmount;

    public ATM(long moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public long takeMoney(long takeMoney) {
        if (takeMoney > moneyAmount) {
            return 0;
        }
        takeMoney = moneyAmount - takeMoney;
        return takeMoney;
    }

    public long putMoney(long putMoney) {
        moneyAmount = moneyAmount + putMoney;
        return moneyAmount;
    }
}