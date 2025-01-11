package Lesson8.Pratices_Interface;

public class PayPal implements PaymentMethod {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal Account: " + email;
    }
}
