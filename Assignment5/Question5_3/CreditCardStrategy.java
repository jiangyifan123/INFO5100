package Question5_3;

public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;

    public CreditCardStrategy(String s) {
        cardNumber = s;
    }

    @Override
    public void pay(int value) {
        System.out.println("CreditCard : $" + value);
    }
}
