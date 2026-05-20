public class Mobil extends Kendaraan {
    private int jumlahKursi;
    private String transmisi;

     public Mobil(String nama, String kondisi, double tarifHarian, int unitKendaraan, int jumlahKursi, String transmisi) {
        super(nama, kondisi, tarifHarian, unitKendaraan);
        this.jumlahKursi = jumlahKursi;
        this.transmisi = transmisi;
    }
}
