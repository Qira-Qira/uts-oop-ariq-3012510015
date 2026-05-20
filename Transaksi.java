public class Transaksi {
    private String namaPetugas;

    public Transaksi(String namaPetugas){
        this.namaPetugas = namaPetugas;
    }

    public void tampilkIdentitas(){
        System.out.println("Petugas : " + namaPetugas);
    }
}
