package pert3;

public class UjiKaryawan {
    public static void main(String[] args) {
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        Karyawan karyawanBiasa = new Karyawan("Budi Santoso", 4000000.0);

        System.out.println("Status: Karyawan Biasa");
        karyawanBiasa.tampilInfo();
        System.out.println();

        Manajer manajer = new Manajer("Siti Aminah", 6000000.0, 2500000.0);

        System.out.println("Status: Manajer");
        manajer.tampilInfo();
    }
}