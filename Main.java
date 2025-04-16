import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== MANUSIA ====");
        Manusia m1 = new Manusia("A", true, "111", true);

        System.out.println(m1);

        System.out.println("\n==== MAHASISWA FILKOM ====");
        MahasiswaFILKOM mhs1 = new MahasiswaFILKOM("B", false, "111", false, "165150300111100", 4.0);

        System.out.println(mhs1);


        System.out.println("\n==== PEKERJA ====");
        Pekerja pk1 = new Pekerja("C", true, "111", true, 1150.0, LocalDate.now().minusYears(2), 4);

        System.out.println(pk1);
        System.out.println("Pendapatan Total: $" + pk1.getPendapatan());

        System.out.println("\n==== MANAGER ====");
        Manager man = new Manager("D", true, "111", true, 1000,
                LocalDate.now().minusYears(15), 3, "HRD");

        System.out.println(man);
        System.out.println("Pendapatan Total: $" + man.getPendapatan());
    }
}
