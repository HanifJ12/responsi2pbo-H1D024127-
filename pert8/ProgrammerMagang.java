package pert8;

public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {
    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;

    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false;
    }

    @Override
    public double hitungGaji(int jamKerja) {
        double total = jamKerja * gajiPerJam;
        System.out.println("Gaji " + nama + " (" + jamKerja + " jam) adalah: Rp " + total);
        return total;
    }

    @Override
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak diperpanjang " + durasiBulan + " bulan.");
    }

    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari";
    }

    @Override
    public void login(String pin) {
        if (pinRahasia.equals(pin)) {
            sedangLogin = true;
            System.out.println("Login Berhasil. Selamat datang, " + nama + "!");
        } else {
            System.out.println("Login Gagal: PIN salah.");
        }
    }

    @Override
    public void logout() {
        sedangLogin = false;
        System.out.println(nama + " berhasil logout.");
    }

    @Override
    public String getRoleAkses() {
        return "Magang IT";
    }
}