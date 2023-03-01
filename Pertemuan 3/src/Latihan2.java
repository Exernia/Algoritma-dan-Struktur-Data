import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner float19D = new Scanner(System.in);
        Scanner string19D = new Scanner(System.in);

        Mahasiswa[] kelas1D = new Mahasiswa[3];

        for (int i = 0; i < kelas1D.length; i++) {
            kelas1D[i] = new Mahasiswa();
            System.out.printf("------------------ Mahasiswa ke-%d ------------------\n", (i + 1));
            System.out.print("Masukkan Nama Mahsiswa\t: ");
            kelas1D[i].namaMhs19D = string19D.nextLine();
            System.out.print("Masukkan NIM\t\t: ");
            kelas1D[i].nIM19D = string19D.nextLine();
            System.out.print("Masukkan Jenis Kelamin\t: ");
            kelas1D[i].jenKel19D = string19D.nextLine();
            System.out.print("Masukkan Nilai IPK\t: ");
            kelas1D[i].iPK19D = float19D.nextFloat();
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < kelas1D.length; i++) {
            System.out.printf("------------------ Mahasiswa ke-%d ------------------\n", (i + 1));
            kelas1D[i].cetakData19D();
        }

        float19D.close();
        string19D.close();
    }
}

class Mahasiswa {
    String namaMhs19D, nIM19D, jenKel19D;
    float iPK19D;

    void cetakData19D() {
        System.out.println("Nama\t\t: " + namaMhs19D);
        System.out.println("NIM\t\t: " + nIM19D);
        System.out.println("Jenis Kelamin\t: " + jenKel19D);
        System.out.println("Nilai IPK\t: " + iPK19D);
    }
}
