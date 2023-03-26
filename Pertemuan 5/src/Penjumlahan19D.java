import java.util.Scanner;;

public class Penjumlahan19D {
    int elemen19D;
    double keuntungan19D[], total19D;

    Penjumlahan19D(int elemen19D) {
        this.elemen19D = elemen19D;
        keuntungan19D = new double[elemen19D];
        total19D = 0;
    }

    double totalBF19D(double arr19D[]) {
        for (int i = 0; i < elemen19D; i++) {
            total19D += arr19D[i];
        }

        return total19D;
    }

    double totalDC19D(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double ljumlah = totalDC19D(arr, l, mid - 1);
            double rjumlah = totalDC19D(arr, mid + 1, r);
            return ljumlah + rjumlah + arr[mid];
        } else {
            return 0;
        }
    }
}

class utamaPenjumlahan19D {
    public static void main(String[] args) {
        Scanner rayhan19D = new Scanner(System.in);

        System.out.println("==========================================================");
        System.out.println("Program Menghitung Keuntungan Total");
        System.out.print("Masukkan jumlah perusahaan: ");
        int jmlhPerusahaan19D = rayhan19D.nextInt();
        System.out.println();
        Penjumlahan19D[] sm19D = new Penjumlahan19D[jmlhPerusahaan19D];

        System.out.println("==========================================================");
        for (int i = 0; i < sm19D.length; i++) {
            System.out.printf("Masukkan jumlah bulan perusahaan ke-%d: ", (i + 1));
            int elemen19D = rayhan19D.nextInt();

            for (int j = 0; j < elemen19D; j++) {
                sm19D[i] = new Penjumlahan19D(elemen19D);
                System.out.printf("Masukkan keuntungan bulan ke-%d: ", (j + 1));
                sm19D[i].keuntungan19D[i] = rayhan19D.nextDouble();
            }
            System.out.println();
        }

        System.out.println("==========================================================");
        for (int i = 0; i < sm19D.length; i++) {
            System.out.println("Perhitungan dengan algoritma Brute Force");
            System.out.printf("Total keuntungan perusahaan ke-%d selama %d bulan: %.5f\n", (i + 1), sm19D[i].elemen19D,
            sm19D[i].totalBF19D(sm19D[i].keuntungan19D));
            System.out.println("Perhitungan dengan algoritma Divide and Conquer");
            System.out.printf("Total keuntungan perusahaan ke-%d selama %d bulan: %.5f\n", (i + 1), sm19D[i].elemen19D,
            sm19D[i].totalDC19D(sm19D[i].keuntungan19D, 0, (sm19D[i].elemen19D - 1)));
            System.out.println("==========================================================");
        }

        rayhan19D.close();
    }
}
