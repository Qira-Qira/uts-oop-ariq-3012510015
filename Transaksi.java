public class Transaksi {
    private String namaPetugas;

    public Transaksi(String namaPetugas){
        this.namaPetugas = namaPetugas;
    }

    public void tampilkIdentitas(){
        System.out.println("Petugas : " + namaPetugas);
    }

    public void prosesTransaksi(Kendaraan kendaraan, int hari, String namaPelanggan) {
        System.out.println("Pelanggan : " + namaPelanggan);
        kendaraan.tampilInfo();
        System.out.println("Hari Sewa : " + hari);
        System.out.println();
        System.out.println("Informasi Tambahan:");
        System.out.println(kendaraan.informasiTambahan());
        System.out.println();

        if (!kendaraan.isHariSewaValid(hari)) {
            System.out.println("Status Transaksi : Gagal");
            System.out.println("Alasan : Jumlah hari sewa tidak valid");
            return;
        } else if (!kendaraan.isUnitTersedia()) {
            System.out.println("Status Transaksi : Gagal");
            System.out.println("Alasan : Unit kendaraan tidak tersedia");
            return;
        } else if (!kendaraan.isKondisiLayak()) {
            System.out.println("Status Transaksi : Gagal");
            System.out.println("Alasan : Kondisi kendaraan tidak layak digunakan");
            return;
        } else{
            
        kendaraan.sewa(hari);
        double total = kendaraan.hitungHargaAkhir(hari);

        System.out.println("Status Transaksi : Berhasil");
        System.out.println("Keterangan : " + kendaraan.tipeKendaraan() + " Berhasil disewa");
        System.out.println("Total Biaya : Rp" + (long) total + ".0");
        System.out.println("Sisa Unit : " + kendaraan.getUnitKendaraan());
        }

    }

}
