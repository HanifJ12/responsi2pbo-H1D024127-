package pert7;

public class PaymentTest {

    public static void main(String[] args) {
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        EWalletPayment pembayaran = new EWalletPayment("OVO", 50000, 150000);

        System.out.println("Saldo awal: " + (int) pembayaran.getBalance());

        pembayaran.processPayment();

        System.out.println("Sisa saldo: " + (int) pembayaran.getBalance());
        System.out.println("Detail Transaksi: " + pembayaran.getPaymentDetails());
    }
}
