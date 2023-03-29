public class PencarianMhs19D {
    Mahasiswa19D[] daftarMhs19D = new Mahasiswa19D[5];
    int idx19D;

    void tambah19D(Mahasiswa19D m) {
        if (idx19D < daftarMhs19D.length) {
            daftarMhs19D[idx19D] = m;
            idx19D++;
        } else {
            System.out.println("Data sudah penuh!!!");
        }
    }

    void tampil19D() {
        for (Mahasiswa19D m : daftarMhs19D) {
            m.tampil19D();
            System.out.println("----------------------------\n");

        }
    }

    int FindSeqSearch19D(int cari19D) {
        int posisi = -1;
        for (int i = 0; i < daftarMhs19D.length; i++) {
            if (daftarMhs19D[i].getnIM19D() == cari19D) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    int FindBinarySearch19D(int cari19D, int kiri19D, int kanan19D) {
        int tengah19D;

        if (kanan19D >= kiri19D) {
            tengah19D = (kiri19D + kanan19D) / 2;
            if (cari19D == daftarMhs19D[tengah19D].getnIM19D()) {
                return (tengah19D);
            } else if (daftarMhs19D[tengah19D].getnIM19D() < cari19D) {
                return FindBinarySearch19D(cari19D, kiri19D, tengah19D - 1);
            } else {
                return FindBinarySearch19D(cari19D, tengah19D + 1, kanan19D);
            }
        }
        return -1;
    }

    void tampilPosisi19D(int x, int pos) {
        if (pos != -1) {
            System.out.printf("Data %d ditemukan pada indeks %d\n", x, pos);
        } else {
            System.out.printf("Data %d tidak ditemukan\n", x);
        }
    }

    void tampilData19D(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t: " + daftarMhs19D[pos].getnIM19D());
            System.out.println("Nama\t: " + daftarMhs19D[pos].getNama19D());
            System.out.println("Umur\t: " + daftarMhs19D[pos].getUmur19D());
            System.out.println("IPK\t: " + daftarMhs19D[pos].getiPK19D());
        } else {
            System.out.printf("Data %d tidak ditemukan\n", x);
        }
    }
}
