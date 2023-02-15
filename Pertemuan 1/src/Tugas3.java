import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        int[][] stokBunga = { { 10, 5, 15, 7 }, { 6, 11, 9, 12 }, { 2, 10, 10, 5 }, { 5, 7, 12, 9 } };
        // int[] hargaBunga = { 75000, 50000, 60000, 10000 };
        String[] cabangToko = { "RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4" };
        String[] namaBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };

        Scanner rayhan19D = new Scanner(System.in);

        System.out.print("Cari bungan yang ingin dicari stoknya: ");
        String cariBunga = rayhan19D.nextLine();
        System.out.println();

        for (int i = 0; i < namaBunga.length; i++) {
            if (cariBunga.equalsIgnoreCase(namaBunga[i])) {
                for (int j = 0; j < cabangToko.length; j++) {
                    System.out.printf("Stok bunga di cabang %s: %d\n", cabangToko[j], stokBunga[j][i]);
                }
                System.out.printf("\nTotal stok bunga %s\t: %d\n", namaBunga[i],
                        (stokBunga[0][i] + stokBunga[1][i] + stokBunga[2][i] + stokBunga[3][i]));
            } else {
                System.out.println("Nama bunga tidak ada");
                break;
            }
        }

        rayhan19D.close();
    }
}
