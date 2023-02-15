import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner rayhan19D = new Scanner(System.in);

        System.out.print("Masukkan NIM Anda: ");
        String nIMKu = rayhan19D.nextLine();

        System.out.println("================================================");

        String[] namaHari = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Ahad" };
        int nIMAngka = Integer.parseInt((String.valueOf(nIMKu.charAt(nIMKu.length() - 2)))
                + (String.valueOf(nIMKu.charAt(nIMKu.length() - 1))));
        int pencacah = 0;

        if (nIMAngka < 10) {
            nIMAngka += 10;
        }

        System.out.println("N: " + nIMAngka);

        for (int i = 0; i < nIMAngka; i++) {
            if (pencacah >= namaHari.length) {
                pencacah = 0;
            }
            System.out.print(namaHari[pencacah] + " ");
            pencacah++;
        }
        rayhan19D.close();
    }
}
