public class Manusia {
   private String nama;
   private boolean JenisKelamin;
   private String nik;
   private boolean Menikah;

    public Manusia(String nama, boolean JenisKelamin, String nik, boolean Menikah) {
        this.nama = nama;
        this.JenisKelamin = JenisKelamin;
        this.nik = nik;
        this.Menikah = Menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.JenisKelamin = jenisKelamin;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setMenikah(boolean menikah) {
        this.Menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public boolean isJenisKelamin() {
        return JenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public boolean isMenikah() {
        return Menikah;
    }

    public double getTunjangan () {
        if (Menikah) {
            return JenisKelamin ? 25.0 : 20.0 ;
        } else {
            return 15.0;
        }
    }

    public double getPendapatan () {
        return getTunjangan();
    }

    public String toString() {
        String JenisKelaminStr = JenisKelamin ? "Laki-Laki" : "Perempuan";
        return "Nama          : " + nama + "\n" + "NIK           : " + nik + "\n" + "Jenis Kelamin : " + JenisKelaminStr + "\n" + "Pendapatan    : $" + getPendapatan();
    } 
}