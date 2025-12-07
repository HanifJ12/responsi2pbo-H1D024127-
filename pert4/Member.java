package pert4;

class Member extends Customer {
    int poinReward;
    String levelKeanggotaan;

    Member(String namaLengkap, String idCustomer, int totalBelanja,
           int poinReward, String levelKeanggotaan) {
        super(namaLengkap, idCustomer, totalBelanja);
        this.poinReward = poinReward;
        this.levelKeanggotaan = levelKeanggotaan;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + poinReward + " | Level: " + levelKeanggotaan);
    }
}
