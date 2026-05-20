public class Motor extends Kendaraan {
    private String jenisMotor;

    public Motor(String nama, String kondisi, double tarifHarian, int unitKendaraan, String jenisMotor) {
        super(nama, kondisi, tarifHarian, unitKendaraan);
        this.jenisMotor = jenisMotor;
    }
}
