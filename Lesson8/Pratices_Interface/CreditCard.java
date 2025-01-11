package Lesson8.Pratices_Interface;

public class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    CreditCard(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid: " + amount + " using Credit Card.");
    };

    public String getPaymentDetails() {
        return "Credit Card: " + cardNumber + ", Holder: " + cardHolderName;
    };
}
