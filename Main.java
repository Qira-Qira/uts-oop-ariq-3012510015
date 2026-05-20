public class Main {
    public static void main(String args[]) {
        Kendaraan avanza = new Mobil("Toyota Avanza", "Baik", 385000, 3, 7, "Manual");
        Kendaraan beat = new Motor("Honda Beat", "Baik", 80000, 5, "Matic");
        Kendaraan brio = new Mobil("Honda Brio", "Baik", 320000, 0, 5, "Matic");
        Kendaraan r15 = new Motor("Yamaha R15", "Rusak", 200000, 2, "Sport");

        Transaksi transaksi = new Transaksi("Rina");

        transaksi.tampilkIdentitas();
        transaksi.prosesTransaksi(avanza, 2, "Andi");
        System.out.println("========================================");

        transaksi.tampilkIdentitas();
        transaksi.prosesTransaksi(beat, 3, "Budi");
        System.out.println("========================================");

        transaksi.tampilkIdentitas();
        transaksi.prosesTransaksi(brio, 2, "Citra");
        System.out.println("========================================");

        transaksi.tampilkIdentitas();
        transaksi.prosesTransaksi(r15, 1, "Dina");
    }
}
