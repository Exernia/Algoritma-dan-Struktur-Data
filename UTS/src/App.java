import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner integer19D = new Scanner(System.in);
        Scanner string19D = new Scanner(System.in);

        System.out.print("Masukkan NIM Anda\t\t: ");
        Long isiNIM19D = integer19D.nextLong();
        String stringNama = String.valueOf(isiNIM19D);
        System.out.println(stringNama.charAt(3));
        int[] array = new int[stringNama.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = stringNama.charAt(i);
        }
        System.out.println(array[1]);
        System.out.print("Masukkan nama lengkap Anda\t: ");
        String isiNama19D = string19D.nextLine();

        int[] angka19D = UTS.konversiHurufKeAngka19D(isiNama19D);
        int[] array19D = UTS.penggabungan19D(angka19D, isiNIM19D);

        for (int i = 0; i < array19D.length; i++) {
            System.out.print(array19D[i] + " ");
        }

        integer19D.close();
        string19D.close();

    }

    static int[] konversiHurufKeAngka19D(String namaLengkap19D) {
        String nama19D = namaLengkap19D.replaceAll("\\s+", "").toLowerCase();
        int[] angka = new int[nama19D.length()];

        for (int i = 0; i < nama19D.length(); i++) {
            angka[i] = (int) nama19D.charAt(i) - 96;
        }

        return angka;
    }

    static int[] penggabungan19D(int[] angka, Long nim) {
        String stringNama = String.valueOf(nim);
        int[] array = new int[stringNama.length() + angka.length];

        for (int i = 0; i < stringNama.length(); i++) {
            array[i] = stringNama.charAt(i);
        }

        for (int i = stringNama.length(); i < angka.length; i++) {
            array[i] = angka[i - stringNama.length()];
        }

        return array;
    }
}
