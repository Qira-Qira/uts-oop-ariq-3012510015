// Implementasi Abstract Class untuk membuat fungsi abstract atau mencetak sebuah blueprint untuk digunakan kembali
public abstract class Kendaraan {
// Implementasi Encapsulation dengan access modifier private supaya lebih aman
    private String nama;
    private String kondisi;
    private double tarifHarian;
    private int unitKendaraan;

    // Ini adalah Constructor dari class Kendaraan untuk memberikan nilai awal pada Objek
    public Kendaraan(String nama, String kondisi, double tarifHarifan, int unitKendaraan) {
        this.nama = nama;
        this.kondisi = kondisi;
        this.tarifHarian = tarifHarifan;
        this.unitKendaraan = unitKendaraan;
    }

    public String getNama() {
        return nama;
    }

    public String getKondisi() {
        return kondisi;
    }

    public double getTarifHarian() {
        return tarifHarian;
    }

    public int getUnitKendaraan() {
        return unitKendaraan;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public void setTarifHarian(double tarifHarian) {
        this.tarifHarian = tarifHarian;
    }

    public void setUnitKendaraan(int unitKendaraan) {
        this.unitKendaraan = unitKendaraan;
    }

    public boolean isUnitTersedia() {
        return unitKendaraan > 0;
    }

    public boolean isKondisiLayak() {
        // Fungsi equalsIgnoreCase adalah untuk menghiraukan huruf kapital atau case sensitive
        return "Baik".equalsIgnoreCase(kondisi);
    }

    public boolean isHariSewaValid(int hari) {
        return hari > 0;
    }

    public boolean sewa(int hari) {
        if (!isHariSewaValid(hari)) {
            return false;
        } else if (!isUnitTersedia()) {
            return false;
        } else if (!isKondisiLayak()) {
            return false;
        } else {
            unitKendaraan -= 1;

            return true;
        }

    }

    public double hitungTotalBiaya(int hari) {
        return tarifHarian * hari;
    }

    public void tampilInfo() {
        System.out.println("Jenis : " + tipeKendaraan() + "\n" +
                "Nama : " + nama + "\n" +
                "Kondisi : " + kondisi + "\n" +
                "Unit : " + unitKendaraan);
    }

    // Ini adalah Abstract function, dengan syarat harus membuat class abstract terlebih dahulu, baru bisa membuat abstract function
    public abstract String tipeKendaraan();

    public abstract double hitungHargaAkhir(int hari);

    public abstract String informasiTambahan();

}