public class CreditCardPayment {
    public static void main(String[] args) {
        double beginningBalance = 5000;
        final double INTEREST_RATE = .17;
        double firstMonth = beginningBalance * INTEREST_RATE + beginningBalance;
        double secondMonth = firstMonth * INTEREST_RATE + firstMonth;

        System.out.println("First month payment: " + firstMonth);
        System.out.println("Second month payment: " + secondMonth);



    }
}
