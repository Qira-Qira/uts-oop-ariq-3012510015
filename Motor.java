// Implementasi Inheritance turunan dari class Kendaraan dengan parent nya itu kendaraan dan child nya itu Motor
public class Motor extends Kendaraan {
    private String jenisMotor;

     // Ini adalah Constructor dari class Motor untuk memberikan nilai awal pada Objek
    public Motor(String nama, String kondisi, double tarifHarian, int unitKendaraan, String jenisMotor) {
        super(nama, kondisi, tarifHarian, unitKendaraan);
        this.jenisMotor = jenisMotor;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    @Override
    public String tipeKendaraan() {
        return "Motor";
    }

    @Override
    public double hitungHargaAkhir(int hari) {
        double biayaDasar = getTarifHarian() * hari;
        // Fungsi equalsIgnoreCase adalah untuk menghiraukan huruf kapital atau case sensitive
        if ("Sport".equalsIgnoreCase(jenisMotor)) {
            return biayaDasar + (biayaDasar * 0.25);
        }
        return biayaDasar;
    }

    @Override
    public String informasiTambahan() {
        return "Jenis Motor : " + jenisMotor;
    }

}
