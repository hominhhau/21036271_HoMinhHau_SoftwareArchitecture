package StrategyPattern;

// Thanh toán bằng Paypal
public class PaypalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public PaypalStrategy(String email, String password) {
        this.emailId = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        int fee = 2 * amount / 100;
        System.out.println(fee  + " paid using Paypal.");
    }
}
