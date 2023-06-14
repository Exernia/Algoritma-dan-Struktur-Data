import java.util.Scanner;

public class Utama19D {
    public static void main(String[] args) {
        AntreanTruk19D antreanTruk19D = new AntreanTruk19D("Truk");
        TumpukanKayu19D tumpukanKayu19D = new TumpukanKayu19D("Kayu");

        Scanner trukInt = new Scanner(System.in);

        boolean kurangDari5 = true;

        System.out.println("=================================================");
        while (kurangDari5) {
            System.out.print("Total truk (minimal 5): ");
            int totalTruk = trukInt.nextInt();
            System.out.println();

            if (totalTruk >= 5) {
                for (int i = 1; i <= totalTruk; i++) {
                    antreanTruk19D.masukkanAntrean19D("Truk " + i);
                }
                kurangDari5 = false;
            } else {
                System.out.println("Total truk harus lebih dari 5!!!\nSilakan input total truk kembali");
            }
            System.out.println("=================================================");
        }

        while (!antreanTruk19D.apakahKosong19D()) {
            String truk = antreanTruk19D.keluarAntrian19D();
            System.out.println(truk + " sedang mengangkut balok kayu.");
            tumpukanKayu19D.masukkanTumpukan19D("Balok kayu dari " + truk);
            System.out.println(truk + " selesai mengangkut kayu.\n");
        }

        System.out.println("Semua truk selesai.");
        System.out.println("=================================================");

        while (!tumpukanKayu19D.apakahKosong19D()) {
            String balokKayu = tumpukanKayu19D.keluarTumpukan19D();
            System.out.println(balokKayu + " diambil dari tumpukan.");
        }

        System.out.println("Semua balok kayu diambil dari tumpukan.");
        System.out.println("=================================================");

        trukInt.close();
    }
}
