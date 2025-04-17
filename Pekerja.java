import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahun, int bulan, int hari, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, hari);
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int lamaKerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamaKerja <= 5) return gaji * 0.05;
        else if (lamaKerja <= 10) return gaji * 0.10;
        else return gaji * 0.15;
    }

    public double getGaji() {
        return gaji;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + gaji + getBonus() + (jumlahAnak * 20);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ntahun masuk\t: " + tahunMasuk.getDayOfMonth() + " " + tahunMasuk.getMonthValue() + " " + tahunMasuk.getYear() +
                "\njumlah anak\t: " + jumlahAnak +
                "\ngaji\t\t: " + gaji;
    }
}
