import java.util.Scanner;

public class Pangkat19D {
    private int pangkat19D, nilai19D;

    Pangkat19D(int pangkat19D, int nilai19D) {
        this.pangkat19D = pangkat19D;
        this.nilai19D = nilai19D;
    }

    int getterPangkat() {
        return pangkat19D;
    }

    int getterNilai() {
        return nilai19D;
    }

    int pangkatBF19D(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC19D(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) {
                return (pangkatDC19D(a, n / 2) * pangkatDC19D(a, n / 2) * a);
            } else {
                return (pangkatDC19D(a, n / 2) * pangkatDC19D(a, n / 2));
            }
        }
    }
}

class utamaPangkat19D {
    public static void main(String[] args) {
        Scanner rayhan19D = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.print("Masukkan jumlah elemen: ");
        int elemen19D = rayhan19D.nextInt();

        Pangkat19D[] png19D = new Pangkat19D[elemen19D];

        int nilai, pangkat;
        for (int i = 0; i < png19D.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai = rayhan19D.nextInt();
            System.out.print("Masukkan pangkat ke-" + (i + 1) + ": ");
            pangkat = rayhan19D.nextInt();

            png19D[i] = new Pangkat19D(pangkat, nilai);
        }

        System.out.println("=========================================");
        System.out.println("Hasil pangkat dengan Brute Force");
        for (int i = 0; i < png19D.length; i++) {
            System.out.printf("Nilai %d pangkat %d: %d\n", png19D[i].getterNilai(), png19D[i].getterPangkat(),
                    png19D[i].pangkatBF19D(png19D[i].getterNilai(), png19D[i].getterPangkat()));
        }

        System.out.println("=========================================");
        System.out.println("Hasil pangkat dengan Divide and Conquer");
        for (int i = 0; i < png19D.length; i++) {
            System.out.printf("Nilai %d pangkat %d: %d\n", png19D[i].getterNilai(), png19D[i].getterPangkat(),
                    png19D[i].pangkatDC19D(png19D[i].getterNilai(), png19D[i].getterPangkat()));
        }
        System.out.println("=========================================");

        rayhan19D.close();
    }
}
