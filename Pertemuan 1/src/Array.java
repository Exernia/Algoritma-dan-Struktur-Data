import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[][] stokBunga = { { 10, 5, 15, 7 }, { 6, 11, 9, 12 }, { 2, 10, 10, 5 }, { 5, 7, 12, 9 } };
        int[] hargaBunga = { 75000, 50000, 60000, 10000 };
        String[] cabangToko = { "RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4" };
        String[] namaBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };

        Scanner rayhan19D = new Scanner(System.in);

        System.out.print("Cari bungan yang ingin dicari stoknya: ");
        String cariBunga = rayhan19D.nextLine();
        System.out.println();
        boolean periksa = false;

        for (int i = 0; i < namaBunga.length; i++) {
            if (cariBunga.equalsIgnoreCase(namaBunga[i])) {
                periksa = cariBunga.equalsIgnoreCase(namaBunga[i]);
            }
        }

        if (periksa) {
            for (int j = 0; j < namaBunga.length; j++) {
                if (cariBunga.equalsIgnoreCase(namaBunga[j])) {
                    for (int k = 0; k < cabangToko.length; k++) {
                        System.out.printf("Stok bunga di cabang %s: %d\n", cabangToko[k], stokBunga[k][j]);
                    }
                    System.out.printf("\nTotal stok bunga %s\t: %d\n", namaBunga[j],
                            (stokBunga[0][j] + stokBunga[1][j] + stokBunga[2][j] + stokBunga[3][j]));
                }
            }
        } else {
            System.out.println("Nama bunga tidak ada");
        }

        System.out.println("================================================");
        System.out.println("Informasi Stok Tiap Jenis Bunga\n");

        for (int i = 0; i < namaBunga.length; i++) {
            System.out.printf("Stok bunga %s\t: %d\n", namaBunga[i],
                    (stokBunga[0][i] + stokBunga[1][i] + stokBunga[2][i] + stokBunga[3][i]));
        }

        System.out.println("================================================");

        stokBunga[0][0] -= 1;
        stokBunga[0][1] -= 2;
        stokBunga[0][2] -= 0;
        stokBunga[0][3] -= 5;

        int totalPendapatan = 0;

        System.out.println("Informasi Toko Bunga " + cabangToko[0] + "\n");
        for (int j = 0; j < namaBunga.length; j++) {
            System.out.printf("Stok Bunga %s\t: %d\n", namaBunga[j], stokBunga[0][j]);
            totalPendapatan += (stokBunga[0][j] * hargaBunga[j]);
        }

        System.out.println("\nTotal Pendapatan\t: Rp" + totalPendapatan);
        System.out.println("================================================");

        rayhan19D.close();
    }
}
