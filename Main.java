package project;

public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa("Budi", 20, 12345);
        Dosen dsn = new Dosen("Pak Andi", 45, 98765);
        Jurusan jur = new Jurusan("Informatika", "TI-1A");

        System.out.println("=== Mahasiswa ===");
        mhs.tampilkanStatus();
        System.out.println("NIM: " + mhs.getNim());
        mhs.aktivitas();

        System.out.println("\n=== Dosen ===");
        dsn.tampilkanStatus();
        System.out.println("NIP: " + dsn.getNip());
        dsn.aktivitas();

        System.out.println("\n=== Jurusan ===");
        jur.tampilkanJurusan();
    }
}