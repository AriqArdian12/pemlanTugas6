import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    double gaji;
    LocalDate tahunMasuk;
    int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus () {
        int TahunBekerja = Period.between(tahunMasuk, LocalDate.now()).getYears();
        if (TahunBekerja <= 5) {
            return 0.05 * gaji;
        } else if (TahunBekerja <= 10) {
            return 0.10 * gaji;
        } else {
            return 0.15 * gaji;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + gaji + getBonus() + (jumlahAnak * 20);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Tahun Masuk   : " + tahunMasuk.getYear() + "\n" +  "Jumlah Anak   : " + jumlahAnak + "\n" + "Gaji          : $" + gaji;
    }
}

