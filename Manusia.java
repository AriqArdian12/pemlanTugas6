public class Manusia {
    private String nama;
    private boolean jenisKelamin; // true: laki-laki, false: perempuan
    private String nik;
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25 : 20;
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return "nama\t\t: " + nama +
                "\nnik\t\t: " + nik +
                "\njenisKelamin\t: " + (jenisKelamin ? "Laki-laki" : "Perempuan") +
                "\npendapatan\t: " + getPendapatan();
    }
}
