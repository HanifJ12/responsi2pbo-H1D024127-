package pert4;

class Customer {
    String namaLengkap;
    String idCustomer;
    int totalBelanja;

    Customer(String namaLengkap, String idCustomer, int totalBelanja) {
        this.namaLengkap = namaLengkap;
        this.idCustomer = idCustomer;
        this.totalBelanja = totalBelanja;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + namaLengkap + " | ID: " + idCustomer +
                " | Total Belanja: Rp " + totalBelanja);
    }
}
