package pert6;

public abstract class KendaraanGalaksi {
    private String namaKendaraan;
    private int levelEnergi;
    private int kapasitasPenumpang;

    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    protected void setLevelEnergi(int levelEnergi) {
        if (levelEnergi < 0) {
            this.levelEnergi = 0;
        } else if (levelEnergi > 100) {
            this.levelEnergi = 100;
        } else {
            this.levelEnergi = levelEnergi;
        }
    }

    public final void tampilStatus() {
        System.out.println(namaKendaraan + " | Energi: " + levelEnergi + "% | Kapasitas: " + kapasitasPenumpang + " orang");
    }

    public abstract void aktifkanMesin();

    public abstract void jelajah(int jarak);

    public abstract void isiEnergi(int jumlah);
}
