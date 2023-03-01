import java.util.Scanner;

public class PersegiPanjang19D {
    public int panjang, lebar;
}

class utama {
    public static void main(String[] args) {
        Scanner rayhan19D = new Scanner(System.in);
        PersegiPanjang19D[] ppArray19D = new PersegiPanjang19D[3];

        for (int i = 0; i < ppArray19D.length; i++) {
            ppArray19D[i] = new PersegiPanjang19D();
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang\t: ");
            ppArray19D[i].panjang = rayhan19D.nextInt();
            System.out.print("Masukkan lebar\t\t: ");
            ppArray19D[i].lebar = rayhan19D.nextInt();
            System.out.println();
        }

        for (int i = 0; i < ppArray19D.length; i++) {
            System.out.printf("Persegi panjang ke-%d, Panjang: %d, Lebar: %d\n", (i + 1), ppArray19D[i].panjang,
                    ppArray19D[i].lebar);
        }

        rayhan19D.close();
    }
}
