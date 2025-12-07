package pert7;

public class EWalletPayment implements PaymentMethod {
    private String namaLayanan;
    private double nominalPembayaran;
    private double saldoPengguna;

    public EWalletPayment(String namaLayanan, double nominalPembayaran, double saldoPengguna) {
        this.namaLayanan = namaLayanan;
        this.nominalPembayaran = nominalPembayaran;
        this.saldoPengguna = saldoPengguna;
    }

    @Override
    public void processPayment() {
        System.out.println("Memproses pembayaran sebesar " + (int) nominalPembayaran + "...");
        if (saldoPengguna >= nominalPembayaran + getTransactionFee()) {
            saldoPengguna -= (nominalPembayaran + getTransactionFee());
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan;
    }

    @Override
    public double getTransactionFee() {
        return 2000;
    }

    @Override
    public double getBalance() {
        return saldoPengguna;
    }
}
