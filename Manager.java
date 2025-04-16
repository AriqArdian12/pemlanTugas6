import java.time.LocalDate;

public class Manager extends Pekerja {
    String Departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String Departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.Departemen = Departemen;
    }

    public void setDepartemen(String Departemen) {
        this.Departemen = Departemen;
    }

    public String getDepartemen() {
        return Departemen;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (getGaji() * 0.10);
    }

    @Override
    public String toString () {
        return super.toString() + "\n" + "Departemen    : " + Departemen;
    }
}
