package project;

class Mahasiswa extends Orang {
    private int nim;

    Mahasiswa(String nama, int umur, int nim) {
        super(nama, umur);
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void belajar() {
        System.out.println(getNama() + " sedang belajar.");
    }

    @Override
    void aktivitas() {
        belajar();
    }
}