package pert4;

public class UjiCustomer {
    public static void main(String[] args) {
        Customer customerBiasa = new Customer("Budi Santoso", "CST-001", 500000);

        Member member = new Member("Siti Aminah", "MBR-110", 1250000,
                240, "Gold");

        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        System.out.println("Status: Customer Biasa");
        customerBiasa.tampilkanInfo();
        System.out.println();

        System.out.println("Status: Member");
        member.tampilkanInfo();
    }
}
