package project;

class Dosen extends Orang {
    private int nip;

    Dosen(String nama, int umur, int nip) {
        super(nama, umur);
        this.nip = nip;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public void mengajar() {
        System.out.println(getNama() + " sedang mengajar.");
    }

    @Override
    void aktivitas() {
        mengajar();
    }
}