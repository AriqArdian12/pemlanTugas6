public class MahasiswaFILKOM extends Manusia{
    String nim;
    double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    public String getStatus() {
        String angkatan = "20" + nim.substring(0, 2);
        char kodeProdi = nim.charAt(6); 
        String prodi;

        switch (kodeProdi) {
            case '2':
                prodi = "Teknik Informatika";
                break;
            case '3':
                prodi = "Teknik Komputer";
                break;
            case '4':
                prodi = "Sistem Informasi";
                break;
            case '6':
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodi = "Teknologi Informasi";
                break;
            default:
                prodi = "Prodi Tidak Diketahui";
        }
        return prodi + ", " + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.5 && ipk <= 4.0) {
            return 75.0;
        } else if (ipk >= 3.0) {
            return 50.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "NIM           : " + nim + "\n" + "IPK           : " + ipk + "\n" + "Status        : " + getStatus();
    }
}
