package project;

class Jurusan {
    private String namaJurusan;
    private String kelas;

    Jurusan(String namaJurusan, String kelas) {
        this.namaJurusan = namaJurusan;
        this.kelas = kelas;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public String getKelas() {
        return kelas;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void tampilkanJurusan() {
        System.out.println("Jurusan: " + namaJurusan);
        System.out.println("Kelas: " + kelas);
    }
}