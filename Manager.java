public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahun, int bulan, int hari, int jumlahAnak,
                   String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, hari, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
        setJumlahAnak(jumlahAnak);
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (getGaji() * 0.1); // Tambah 10% dari gaji
    }

    @Override
    public String toString() {
        return super.toString() + "\ndepartemen\t: " + departemen;
    }
}
