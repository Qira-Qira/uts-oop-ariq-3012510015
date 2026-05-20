public class Mobil extends Kendaraan {
    private int jumlahKursi;
    private String transmisi;

     public Mobil(String nama, String kondisi, double tarifHarian, int unitKendaraan, int jumlahKursi, String transmisi) {
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
}
