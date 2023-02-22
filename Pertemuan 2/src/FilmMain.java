public class FilmMain {
    public static void main(String[] args) {
        Film film1 = new Film();

        film1.judul19D = "Quantumania Mancing";
        film1.genre19D = "Action Comedy";
        film1.rate19D = "Remaja";
        film1.jumlahTiket19D = 3000;
        film1.hargaTiket19D = 40000;

        film1.tambahTiket19D(1);
        film1.kurangiTiket19D(3);

        System.out.println("\n===================== Film 1 =====================\n");
        film1.tampilFilm19D();
        int pendapatan19D = film1.totalPendapatan19D();
        System.out.println("Total keuntungan tiket\t: Rp" + pendapatan19D);

        System.out.println("\n===================== Film 2 =====================\n");
        Film film2 = new Film("Maniaquantum", "Horor", "Dewasa", 2000, 40000);
        film2.tampilFilm19D();

        System.out.println("\n===================== Film 3 =====================\n");
        Film film3 = new Film("Mencuri Raden Saleh", "Drama Aksi", "Remaja", 5000, 50000);
        film3.tampilFilm19D();
        System.out.println("Total keuntungan tiket\t: Rp" + film3.totalPendapatan19D());
    }
}
