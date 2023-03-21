import java.util.Scanner;

public class Faktorial19D {
    private int nilai19D;

    Faktorial19D(int nilai19D) {
        this.nilai19D = nilai19D;
    }

    int getter() {
        return nilai19D;
    }

    int faktorialBF19D(int n) {
        int fakto19D = 1;
        for (int i = 1; i <= n; i++) {
            fakto19D *= i;
        }
        return fakto19D;
    }

    int faktorialBFWhile19D(int n) {
        int fakto19D = 1;
        int i = 1;
        while (i <= n) {
            fakto19D *= i;
            i++;
        }
        return fakto19D;
    }

    int faktorialDC19D(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * faktorialDC19D(n - 1);
        }
    }
}

class utamaFaktorial19D {
    public static void main(String[] args) {
        Scanner rayhan19D = new Scanner(System.in);
        System.out.println("======================================");
        System.out.print("Masukkan jumlah elemen: ");
        int elemen19D = rayhan19D.nextInt();

        Faktorial19D[] fk19D = new Faktorial19D[elemen19D];

        int nilai19D;
        for (int i = 0; i < fk19D.length; i++) {
            System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
            nilai19D = rayhan19D.nextInt();
            fk19D[i] = new Faktorial19D(nilai19D);
        }

        System.out.println("=========================================");
        System.out.println("Hasil faktorial dengan Brute Force perulangan for");
        long waktuMulai1 = System.currentTimeMillis();
        for (int i = 0; i < fk19D.length; i++) {
            System.out.printf("Faktorial dari nilai %d: %d\n", fk19D[i].getter(),
                    fk19D[i].faktorialBF19D(fk19D[i].getter()));
        }
        long waktuSelesai1 = System.currentTimeMillis();
        System.out.println("Waktu eksekusi: " + (waktuSelesai1 - waktuMulai1) + " ms");
        System.out.println("\nHasil faktorial dengan Brute Force perulangan while");
        for (int i = 0; i < fk19D.length; i++) {
            System.out.printf("Faktorial dari nilai %d: %d\n", fk19D[i].getter(),
                    fk19D[i].faktorialBFWhile19D(fk19D[i].getter()));
        }

        System.out.println("=========================================");
        System.out.println("Hasil faktorial dengan Divide and Conquer");
        long waktuMulai2 = System.currentTimeMillis();
        for (int i = 0; i < fk19D.length; i++) {
            System.out.printf("Faktorial dari nilai %d: %d\n", fk19D[i].getter(),
                    fk19D[i].faktorialDC19D(fk19D[i].getter()));
        }
        long waktuSelesai2 = System.currentTimeMillis();
        System.out.println("Waktu eksekusi: " + (waktuSelesai2 - waktuMulai2) + " ms");
        System.out.println("=========================================");

        rayhan19D.close();
    }
}
