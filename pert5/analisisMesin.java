package pert5;

import java.util.Arrays;

class analisisMesin {
    public static void main(String[] args) {
        defaultMesin[] daftarMesin = new defaultMesin[5];
        daftarMesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        daftarMesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        daftarMesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70.0);
        daftarMesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        daftarMesin[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80.0);

        System.out.println("=== DATA MESIN MEGATECH ===");

        for (defaultMesin m : daftarMesin) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");

        for (defaultMesin m : daftarMesin) {
            if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            } else if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        defaultMesin mesinTerbaik = daftarMesin[0];
        double performaTertinggi = daftarMesin[0].nilaiPerforma();
        for (int i = 1; i < daftarMesin.length; i++) {
            double perf = daftarMesin[i].nilaiPerforma();
            if (perf > performaTertinggi) {
                performaTertinggi = perf;
                mesinTerbaik = daftarMesin[i];
            }
        }
        System.out.println(mesinTerbaik.namaMesin + " → " + performaTertinggi);

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        Integer[] idx = {0, 1, 2, 3, 4};
        Arrays.sort(idx, (a, b) -> {
            double pa = daftarMesin[a].nilaiPerforma();
            double pb = daftarMesin[b].nilaiPerforma();
            return Double.compare(pb, pa);
        });

        for (int i = 0; i < 3; i++) {
            int id = idx[i];
            System.out.println((i + 1) + ". " + daftarMesin[id].namaMesin +
                    " → " + daftarMesin[id].nilaiPerforma());
        }
    }
}
