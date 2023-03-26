import java.util.Scanner;

public class Pemilu19D {
    String[] namaKandidat19D;
    int[] suara;

    int cariMayoritas(int[] suara, int awal, int akhir) {
        if (awal == akhir) {
            return suara[awal];
        }
        int tengah = (awal + akhir) / 2;
        int mayoritasKiri = cariMayoritas(suara, awal, tengah);
        int mayoritasKanan = cariMayoritas(suara, tengah + 1, akhir);

        if (mayoritasKiri == mayoritasKanan) {
            return mayoritasKiri;
        }
        int suaraMayoritasKiri = hitungSuara(suara, awal, akhir, mayoritasKiri);
        int suaraMayoritasKanan = hitungSuara(suara, awal, akhir, mayoritasKanan);

        if (suaraMayoritasKiri > suaraMayoritasKanan) {
            return mayoritasKiri;
        }
        return mayoritasKanan;
    }

    private int hitungSuara(int[] suara, int awal, int akhir, int kandidat) {
        int suaraKandidat = 0;

        for (int i = awal; i <= akhir; i++) {
            if (suara[i] == kandidat) {
                suaraKandidat++;
            }
        }
        return suaraKandidat;
    }
}

class MainTugas {
    public static void main(String[] args) {
        Scanner rayhan19D = new Scanner(System.in);
        Scanner string19D = new Scanner(System.in);

        System.out.print("Masukkan jumlah kandidat: ");
        int jml = rayhan19D.nextInt();
        System.out.println("===================================");

        Pemilu19D pemilu = new Pemilu19D();
        pemilu.namaKandidat19D = new String[jml];

        for (int i = 0; i < pemilu.namaKandidat19D.length; i++) {
            System.out.printf("Masukkan kandidat ketua BEM ke-%d: ", (i + 1));
            pemilu.namaKandidat19D[i] = string19D.nextLine();
        }

        System.out.print("\nMasukkan jumlah suara: ");
        int jumlahSuara = rayhan19D.nextInt();

        pemilu.suara = new int[jumlahSuara];
        System.out.printf("\nDaftar Kandidat Ketua BEM\n");

        for (int i = 0; i < pemilu.namaKandidat19D.length; i++) {
            System.out.printf("%d. %s\n", (i + 1), pemilu.namaKandidat19D[i]);
        }
        System.out.println("===================================");

        for (int i = 0; i < jumlahSuara; i++) {
            System.out.printf("Masukkan pilihan ke-%d: ", (i + 1));
            pemilu.suara[i] = rayhan19D.nextInt() - 1;
        }

        System.out.println("\n===================================");
        int indeksMayoritas = pemilu.cariMayoritas(pemilu.suara, 0, pemilu.suara.length - 1);
        if (indeksMayoritas > -1) {
            System.out.println("Mayoritas Pilihan: " + pemilu.namaKandidat19D[indeksMayoritas]);
        } else {
            System.out.println("Tidak ada mayoritas");
        }
        System.out.println("===================================");

        rayhan19D.close();
        string19D.close();
    }
}