import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mahasiswa {
    String nIMm, nama, no_telp;

    public Mahasiswa() {

    }

    public Mahasiswa(String nIM, String nama, String no_telp) {
        this.nIMm = nIM;
        this.nama = nama;
        this.no_telp = no_telp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "NIM: " + nIMm + ", Nama: " + nama + ", No. Telp: " + no_telp + "}";
    }
}

class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int indeks) {
        mahasiswas.remove(indeks);
    }

    public void update(int indeks, Mahasiswa mhs) {
        mahasiswas.set(indeks, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }

    int linierSearch(String nIM) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nIM.equals(mahasiswas.get(i).nIMm)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m2 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m3 = new Mahasiswa("201236", "Sannum", "021xx3");

        lm.tambah(m, m2, m3);
        lm.tampil();

        lm.update(lm.linierSearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println();
        lm.tampil();
    }
}
