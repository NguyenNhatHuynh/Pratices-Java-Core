package Lesson8.Pratices_Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Cash");

        int choice = scanner.nextInt();
        scanner.nextLine();

        PaymentMethod paymentMethod = null;

        switch (choice) {
            case 1: // Credit Card
                System.out.print("Enter card number: ");
                String cardNumber = scanner.nextLine();
                System.out.print("Enter card holder name: ");
                String cardHolderName = scanner.nextLine();
                paymentMethod = new CreditCard(cardNumber, cardHolderName);
                break;

            case 2: // PayPal
                System.out.print("Enter PayPal email: ");
                String email = scanner.nextLine();
                System.out.print("Enter PayPal password: ");
                String password = scanner.nextLine();
                paymentMethod = new PayPal(email, password);
                break;

            case 3: // Cash
                paymentMethod = new Cash();
                break;

            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        System.out.print("Enter amount to pay: ");
        double amount = scanner.nextDouble();

        if (paymentMethod != null) {
            paymentMethod.pay(amount);
            System.out.println("Payment details: " + paymentMethod.getPaymentDetails());
        }

        scanner.close();
    }

}
