package pert7;

public interface PaymentMethod {
    void processPayment();
    String getPaymentDetails();
    double getTransactionFee();
    double getBalance();
}
