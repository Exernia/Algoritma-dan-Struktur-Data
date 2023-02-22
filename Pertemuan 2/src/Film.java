public class Film {
    String judul19D, genre19D, rate19D;
    int jumlahTiket19D, hargaTiket19D;

    Film() {

    }

    Film(String judul19D, String genre19D, String rate19D, int jumlahTiket19D, int hargaTiket19D) {
        this.judul19D = judul19D;
        this.genre19D = genre19D;
        this.rate19D = rate19D;
        this.jumlahTiket19D = jumlahTiket19D;
        this.hargaTiket19D = hargaTiket19D;
    }

    void tampilFilm19D() {
        System.out.println("Judul\t\t\t: " + judul19D);
        System.out.println("Genre\t\t\t: " + genre19D);
        System.out.println("Rate\t\t\t: " + rate19D);
        System.out.println("Jumlah Tiket\t\t: " + jumlahTiket19D);
        System.out.println("Harga Tiket\t\t: Rp" + hargaTiket19D);
    }

    void tambahTiket19D(int n) {
        jumlahTiket19D += n;
    }

    void kurangiTiket19D(int n) {
        if (jumlahTiket19D > 0) {
            jumlahTiket19D -= n;
        } else {
            System.out.println("Jumlah tiket tidak boleh negatif");
        }
    }

    int totalPendapatan19D() {
        return jumlahTiket19D * hargaTiket19D;
    }
}