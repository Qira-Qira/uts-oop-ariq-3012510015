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

        
    }

}
