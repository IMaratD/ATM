public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(1_000_000_00);
        atm.putMoney(1000_00);
        atm.takeMoney(10_000_00);
    }
}
