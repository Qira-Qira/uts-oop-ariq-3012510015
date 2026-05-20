public abstract class Kendaraan{
    private String nama;
    private String kondisi;
    private double tarifHarian;
    private int unitKendaraan;

    public Kendaraan(String nama, String kondisi, double tarifHarifan, int unitKendaraan){
        this.nama = nama;
        this.kondisi = kondisi;
        this.tarifHarian = tarifHarifan;
        this.unitKendaraan = unitKendaraan;
    }

    public String getNama(){
        return nama;
    }

    public String kondisi(){
        return kondisi;
    }

    public double tarifHarian(){
        return tarifHarian;
    }

    public int unitKendaraan(){
        return unitKendaraan;
    }
}