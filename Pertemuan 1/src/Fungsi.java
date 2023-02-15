public class Fungsi {
    static void cetakTabel(int[][] stokB, String[] namaB, String[] tokoB) {
        for (int i = 0; i < stokB.length; i++) {
            if (i == 0) {
                System.out.print("Nama Cabang\t|");
                for (int j = 0; j < namaB.length; j++) {
                    System.out.print(namaB[j] + "\t|");
                }
                System.out.println();
            }
            for (int j = 0; j < stokB[i].length; j++) {
                if (j == 0) {
                    System.out.print(tokoB[i] + "\t|");
                }
                System.out.print(stokB[i][j] + "\t\t|");
            }
            System.out.println();
        }
    }

    static void stokBunga(String[] namaB, int[][] stokB, int hargaB[]) {
        for (int i = 0; i < namaB.length; i++) {
            System.out.printf("Stok bunga %s\t: %d\n", namaB[i],
                    (stokB[0][i] + stokB[1][i] + stokB[2][i] + stokB[3][i]));
        }
    }

    public static void main(String[] args) {
        int[][] stokBunga = { { 10, 5, 15, 7 }, { 6, 11, 9, 12 }, { 2, 10, 10, 5 }, { 5, 7, 12, 9 } };
        int[] hargaBunga = { 75000, 50000, 60000, 10000 };
        String[] cabangToko = { "RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4" };
        String[] namaBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };

        System.out.println("=========================================================================================");
        cetakTabel(stokBunga, namaBunga, cabangToko);
        System.out.println("=========================================================================================");
        stokBunga(namaBunga, stokBunga, hargaBunga);
        System.out.println("=========================================================================================");
    }
}
