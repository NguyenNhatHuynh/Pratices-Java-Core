package Lesson8.Pratices_Interface;

public class Cash implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash.");
    }

    @Override
    public String getPaymentDetails() {
        return "Payment method: Cash";
    }
}
