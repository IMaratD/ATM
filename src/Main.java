public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(
                1_000_000_00,
                10_000_000_00);
        System.out.println(atm.getSum());

        System.out.println(atm.setSum(500_00));
    }
}
