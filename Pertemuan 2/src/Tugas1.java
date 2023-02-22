public class Tugas1 {
    String namaBuku19D, namaPengarang19D, penerbit19D;
    int hargaSatuan19D, jumlah19D;

    Tugas1(String namaBuku19D, String namaPengarang19D, String penerbit19D, int hargaSatuan19D, int jumlah19D) {
        this.namaBuku19D = namaBuku19D;
        this.namaPengarang19D = namaPengarang19D;
        this.penerbit19D = penerbit19D;
        this.hargaSatuan19D = hargaSatuan19D;
        this.jumlah19D = jumlah19D;
    }

    int hitungHargaTotal19D() {
        return hargaSatuan19D * jumlah19D;
    }

    int hitungDiskon19D() {
        if (hitungHargaTotal19D() > 100000) {
            return hitungHargaTotal19D() * 10 / 100;
        } else if (hitungHargaTotal19D() > 50000 && hitungHargaTotal19D() < 100000) {
            return hitungHargaTotal19D() * 5 / 100;
        } else {
            return 0;
        }
    }

    int hitungHargaBayar19D() {
        return hitungHargaTotal19D() - hitungDiskon19D();
    }

    void tampilBuku19D() {
        System.out.println("Judul Buku\t\t\t: " + namaBuku19D);
        System.out.println("Nama Pengarang\t\t\t: " + namaPengarang19D);
        System.out.println("Penerbit\t\t\t: " + penerbit19D);
        System.out.println("Harga Satuan\t\t\t: Rp" + hargaSatuan19D);
        System.out.println("Jumlah Pembelian\t\t: " + jumlah19D + " buah");
        System.out.println("Diskon\t\t\t\t: Rp" + hitungDiskon19D());
        System.out.println("Total Bayar\t\t\t: Rp" + hitungHargaBayar19D());
    }

    public static void main(String[] args) {
        System.out.println("\n===================== Buku 1 =====================\n");
        Tugas1 buku1 = new Tugas1("Hujan", "Tere Liye", "Media Komputindo", 70000, 2);
        buku1.tampilBuku19D();
        System.out.println("\n===================== Buku 2 =====================\n");
        Tugas1 buku2 = new Tugas1("Komik", "Masashi Kisimoto", "Elex Media", 20000, 3);
        buku2.tampilBuku19D();
        System.out.println("\n===================== Buku 3 =====================\n");
        Tugas1 buku3 = new Tugas1("Buku tulis", "Rayhan", "Sindu", 5000, 8);
        buku3.tampilBuku19D();
    }
}
