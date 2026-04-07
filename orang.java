package project;

abstract class Orang {
    private String nama;
    private int umur;

    // constructor
    Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // getter & setter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // method biasa
    public void tampilkanStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    // abstract method
    abstract void aktivitas();
}