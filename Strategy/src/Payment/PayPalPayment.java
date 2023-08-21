package Payment;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " TL using PayPal");
    }
}
