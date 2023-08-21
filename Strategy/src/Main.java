import Payment.CreditCardPayment;
import Payment.PayPalPayment;
import Payment.PaymentContext;
import Payment.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCardStrategy = new CreditCardPayment();
        PaymentStrategy paypalStrategy = new PayPalPayment();

        PaymentContext context = new PaymentContext(creditCardStrategy);
        context.performPayment(1500);

        context = new PaymentContext(paypalStrategy);
        context.performPayment(200);
    }
}