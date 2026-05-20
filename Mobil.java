// Implementasi Inheritance turunan dari class Kendaraan dengan parent nya itu kendaraan dan child nya itu Mobil
public class Mobil extends Kendaraan {
    // Implementasi Encapsulation dengan access modifier private supaya lebih aman
    private int jumlahKursi;
    private String transmisi;

    // Ini adalah Constructor dari class Mobil untuk memberikan nilai awal pada Objek
    public Mobil(String nama, String kondisi, double tarifHarian, int unitKendaraan, int jumlahKursi,
            String transmisi) {
        // Implementasi Super class dari class turunan
        super(nama, kondisi, tarifHarian, unitKendaraan);
        this.jumlahKursi = jumlahKursi;
        this.transmisi = transmisi;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public String getTransmisi() {
        return transmisi;
    }

    @Override
    public String tipeKendaraan() {
        return "Mobil";
    }

    @Override
    public double hitungHargaAkhir(int hari) {
        double biayaDasar = getTarifHarian() * hari;
        if (jumlahKursi > 7) {
            return biayaDasar + (biayaDasar * 0.2);
        }
        return biayaDasar;
    }

    @Override
    public String informasiTambahan() {
        return "Jumlah kursi : " + jumlahKursi + "\n" +
                "Transmisi : " + transmisi;
    }
}
