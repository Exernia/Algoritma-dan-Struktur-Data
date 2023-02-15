public class Tugas1 {
    public static void main(String[] args) {
        String[] namaOrg = { "Anii", "Budi", "Bina", "Cita" };
        int[] kiloan = { 4, 15, 6, 11 };
        int[] hargaOrg = new int[kiloan.length];
        int totalPendapatan = 0;

        for (int i = 0; i < kiloan.length; i++) {
            if (kiloan[i] > 10) {
                hargaOrg[i] = (kiloan[i] * 4500) - (kiloan[i] * 4500 * 5 / 100);
            } else {
                hargaOrg[i] = kiloan[i] * 4500;
            }

            totalPendapatan += hargaOrg[i];
        }
        System.out.println("====================================================");
        for (int j = 0; j < namaOrg.length; j++) {
            System.out.printf("%s laundri %dkg\t= Rp%d\n", namaOrg[j], kiloan[j], hargaOrg[j]);
        }
        System.out.println("\nTotal Pendapatan Smile Laundri = Rp" + totalPendapatan);
        System.out.println("====================================================");
    }
}
