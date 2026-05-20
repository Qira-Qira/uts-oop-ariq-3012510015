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

    public String getKondisi(){
        return kondisi;
    }

    public double getTarifHarian(){
        return tarifHarian;
    }

    public int getUnitKendaraan(){
        return unitKendaraan;
    }

    public void setKondisi(String kondisi){
        this.kondisi = kondisi;
    }

    public void setTarifHarian(double tarifHarian){
        this.tarifHarian = tarifHarian;
    }

    public void setUnitKendaraan(int unitKendaraan){
        this.unitKendaraan = unitKendaraan;
    }

    public boolean isUnitTersedia(){
        return unitKendaraan > 0;
    }

    public boolean isKondisiLayak(){
        return "Baik".equalsIgnoreCase(kondisi);
    }

    public boolean isHariSewaValid(int hari){
        return hari > 0;
    }

    public boolean sewa(int hari){
        if(!isHariSewaValid(hari)){
            return false;
        } else if (!isUnitTersedia()){
            return false;
        } else if (!isKondisiLayak()){
            return false;
        } 

        
    }

}