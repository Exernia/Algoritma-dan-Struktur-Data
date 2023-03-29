public class Mahasiswa19D {
    private int nIM19D, umur19D;
    private String nama19D;
    private double iPK19D;

    public int getnIM19D() {
        return nIM19D;
    }

    public int getUmur19D() {
        return umur19D;
    }

    public String getNama19D() {
        return nama19D;
    }

    public double getiPK19D() {
        return iPK19D;
    }

    Mahasiswa19D(int nIM19D, int umur19D, String nama19D, double iPK19D) {
        this.nIM19D = nIM19D;
        this.umur19D = umur19D;
        this.nama19D = nama19D;
        this.iPK19D = iPK19D;
    }

    void tampil19D() {
        System.out.println("NIM\t: " + nIM19D);
        System.out.println("Nama\t: " + nama19D);
        System.out.println("Umur\t: " + umur19D);
        System.out.println("IPK\t: " + iPK19D);
    }
}