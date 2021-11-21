package Question5_3;

public class PaypalStrategy implements PaymentStrategy {
    private String email;

    public PaypalStrategy(String s) {
        email = s;
    }

    @Override
    public void pay(int value) {
        System.out.println("Paypal : $" + value);
    }
}
